import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	//public static final int NUMBER  = 0;
	public static final int ADD     = -1;
	public static final int SUB     = -2;
	public static final int MUL     = -3;
	public static final int DIV     = -4;
	public static final int KAKKO_L = -5;
	public static final int KAKKO_R = -6;
	
	public static final Token ADD_TOK = new Token("+", ADD);
	public static final Token SUB_TOK = new Token("-", SUB);
	public static final Token MUL_TOK = new Token("*", MUL);
	public static final Token DIV_TOK = new Token("/", DIV);
	public static final Token KAKKO_L_TOK = new Token("(", KAKKO_L);
	public static final Token KAKKO_R_TOK = new Token(")", KAKKO_R);
	
	public static class Token{
		String value;
		int type;
		
		public Token(String value, int type) {
			super();
			this.value = value;
			this.type = type;
		}
		
		public String toString(){
			return "[ " + this.value + " " + this.type + " ]";
		}
	}
	
	public static interface Expr{
		public int eval(int mod);
	}
	
	public static class Inner implements Expr{
		Expr inner;

		public Inner(Expr inner) {
			super();
			this.inner = inner;
		}

		@Override
		public int eval(int mod) {
			return inner.eval(mod);
		}
		
		@Override
		public String toString(){
			return "(" + inner +  ")";
		}
	}
	
	public static class Plus implements Expr{
		Expr left, right;

		public Plus(Expr left, Expr right) {
			super();
			this.left = left;
			this.right = right;
		}

		@Override
		public int eval(int mod) {
			return (left.eval(mod) + right.eval(mod)) % mod;
		}
		
		@Override
		public String toString(){
			return left + "+" + right;
		}
	}
	
	public static class Minus implements Expr{
		Expr left, right;

		public Minus(Expr left, Expr right) {
			super();
			this.left = left;
			this.right = right;
		}

		@Override
		public int eval(int mod) {
			return (mod + left.eval(mod) - right.eval(mod)) % mod;
		}
		
		@Override
		public String toString(){
			return left + "-" + right;
		}
	}
	
	public static class Mul implements Expr{
		Expr left, right;

		public Mul(Expr left, Expr right) {
			super();
			this.left = left;
			this.right = right;
		}

		@Override
		public int eval(int mod) {
			return (left.eval(mod) * right.eval(mod)) % mod;
		}
		
		@Override
		public String toString(){
			return left + "*" + right;
		}
	}
	
	public static int mod_pow(int x, int p, int mod){
		if(p == 1){
			return x % mod;
		}else if(p == 0){
			return x == 1 ? 1 : 0;
		}
		
		if(p % 2 == 0){
			int ret = mod_pow(x, p / 2, mod);
			
			return (ret * ret) % mod; 
		}else{
			return (mod_pow(x, p - 1, mod) * x) % mod;
		}
	}
	
	public static class Div implements Expr{
		Expr left, right;

		public Div(Expr left, Expr right) {
			super();
			this.left = left;
			this.right = right;
		}

		@Override
		public int eval(int mod) {
			final int right_ret = right.eval(mod);
			
			if(right_ret == 0){
				throw new ArithmeticException("");
			}
			
			int inv = mod_pow(right_ret, mod - 2, mod);
			
			if(inv == 0){
				throw new ArithmeticException("");
			}
			
			return (left.eval(mod) * inv) % mod;
		}
		
		@Override
		public String toString(){
			return left + "/" + right;
		}
	}
	
	public static class Const implements Expr{
		int cons;
		
		public Const(int cons){
			this.cons = cons;
		}
		
		@Override
		public int eval(int mod){
			return cons;
		}
		
		@Override
		public String toString(){
			return cons + "";
		}
	}
	
	//+, -
	public static Expr parse_1(LinkedList<Token> tokens){
		Expr left = parse_2(tokens);
		
		if(left == null){
			return null;
		}
		
		while(!tokens.isEmpty()){
			if(!(tokens.peek().type == ADD) && !(tokens.peek().type == SUB)){
				return left;
			}
			
			int type = tokens.poll().type;
			Expr right = parse_2(tokens);
			
			if(type == ADD){
				left = new Plus(left, right);
			}else{
				left = new Minus(left, right);
			}
		}
		
		return left;
	}
	
	//*, /
	public static Expr parse_2(LinkedList<Token> tokens){
		Expr left = parse_3(tokens);
		
		if(left == null){
			return null;
		}
		
		while(!tokens.isEmpty()){
			if(!(tokens.peek().type == MUL) && !(tokens.peek().type == DIV)){
				return left;
			}
			
			int type = tokens.poll().type;
			Expr right = parse_3(tokens);
			
			if(type == MUL){
				left = new Mul(left, right);
			}else{
				left = new Div(left, right);
			}
		}
		
		return left;
	}
	
	//primitive, ()
	public static Expr parse_3(LinkedList<Token> tokens){
		if(tokens.isEmpty()){
			return null;
		}else if(tokens.peek().type >= 0){
			return new Const(tokens.poll().type);
		}else if(tokens.peek().type == KAKKO_L){
			tokens.poll();
			Expr expr = parse_1(tokens);
			
			if(tokens.peek().type == KAKKO_R){
				tokens.poll();
				return new Inner(expr);
			}else{
				return null;
			}			
		}
		
		return null;
	}
	
	public static void add_stack(String line, LinkedList<Token> stack){
		char[] input = line.toCharArray();
		
		int count = -1;
		for(char c : input){
			if('0' <= c && c <= '9'){
				if(count == -1){
					count = 0;
				}
				
				count *= 10;
				count += c - '0';
			}else{
				if(count != -1){
					stack.add(new Token("", count));
				}
				count = -1;
			}
			
			switch(c){
			case '+':
				stack.add(ADD_TOK);
				break;
			case '-':
				stack.add(SUB_TOK);
				break;
			case '*':
				stack.add(MUL_TOK);
				break;
			case '/':
				stack.add(DIV_TOK);
				break;
			case '(':
				stack.add(KAKKO_L_TOK);
				break;
			case ')':
				stack.add(KAKKO_R_TOK);
				break;
			}
			
			//System.out.println(stack);
		}
		
		if(count != -1){
			stack.add(new Token("", count));
		}
	}
	/*
	public static void add_stack_old(String token, LinkedList<Token> stack){
		if(token.indexOf("+") >= 0){
			if(token.length() == 1){
				stack.add(ADD_TOK);
				return;
			}else{
				final int pos = token.indexOf("+");
				
				if(pos > 0){
					add_stack(token.substring(0, pos), stack);
				}
					
				stack.add(ADD_TOK);
				
				if(pos + 1 < token.length()){
					add_stack(token.substring(pos + 1, token.length()), stack);
				}
			}
		}else if(token.indexOf("-") >= 0){
			if(token.length() == 1){
				stack.add(SUB_TOK);
				return;
			}else{
				final int pos = token.indexOf("-");
				
				if(pos > 0){
					add_stack(token.substring(0, pos), stack);
				}
					
				stack.add(SUB_TOK);
				
				if(pos + 1 < token.length()){
					add_stack(token.substring(pos + 1, token.length()), stack);
				}
			}
		}else if(token.indexOf("*") >= 0){
			if(token.length() == 1){
				stack.add(MUL_TOK);
				return;
			}else{
				final int pos = token.indexOf("*");
				
				if(pos > 0){
					add_stack(token.substring(0, pos), stack);
				}
					
				stack.add(MUL_TOK);
				
				if(pos + 1 < token.length()){
					add_stack(token.substring(pos + 1, token.length()), stack);
				}
			}
		}else if(token.indexOf("/") >= 0){
			if(token.length() == 1){
				stack.add(DIV_TOK);
				return;
			}else{
				final int pos = token.indexOf("/");
				
				if(pos > 0){
					add_stack(token.substring(0, pos), stack);
				}
					
				stack.add(DIV_TOK);
				
				if(pos + 1 < token.length()){
					add_stack(token.substring(pos + 1, token.length()), stack);
				}
			}
		}else if(token.indexOf("(") >= 0){
			if(token.length() == 1){
				stack.add(KAKKO_L_TOK);
				return;
			}else{
				final int pos = token.indexOf("(");
				
				if(pos > 0){
					add_stack(token.substring(0, pos), stack);
				}
					
				stack.add(KAKKO_L_TOK);
				
				if(pos + 1 < token.length()){
					add_stack(token.substring(pos + 1, token.length()), stack);
				}
			}
		}else if(token.indexOf(")") >= 0){
			if(token.length() == 1){
				stack.add(KAKKO_R_TOK);
				return;
			}else{
				final int pos = token.indexOf(")");
				
				if(pos > 0){
					add_stack(token.substring(0, pos), stack);
				}
					
				stack.add(KAKKO_R_TOK);
				
				if(pos + 1 < token.length()){
					add_stack(token.substring(pos + 1, token.length()), stack);
				}
			}
		}else {
			stack.add(new Token(token, 0));
		}
	}
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<Token> stack = new LinkedList<Token>();
		int count = 0;
		
		while(true){
			String input = sc.nextLine();
			
			if("0:".equals(input)){
				break;
			}
			count++;
			
			if(count > 4){
				count = 0;
				System.gc();
			}
			//System.gc();
			
			String[] in = input.split(":");
			//String[] tokens = in[1].split(" ");
			
			//System.out.println(Arrays.toString(tokens));
			
			stack.clear();
			/*
			for(int i = 0; i < tokens.length; i++){
				if(tokens[i].equals("") || tokens[i].equals(" ")){
					continue;
				}
				
				add_stack(tokens[i], stack);
			}	
			*/
			
			add_stack(in[1], stack);
			//System.out.println(stack);
			
			final int mod = Integer.parseInt(in[0]);
			
			Expr node = parse_1(stack);
			
			try{
				int result = node.eval(mod);
				
				System.out.println(node + " = " + result + " (mod " + mod + ")");
			}catch(ArithmeticException e){
				System.out.println("NG");
			}catch(NullPointerException e){
				System.err.println(input + "\n" + "\n" + stack);
			}
		}
		
		sc.close();
	}
}