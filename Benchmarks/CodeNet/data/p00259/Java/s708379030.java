import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import javax.naming.LimitExceededException;

public class Main {
	
	public static final int NUMBER  = 0;
	public static final int ADD     = 1;
	public static final int SUB     = 2;
	public static final int MUL     = 3;
	public static final int DIV     = 4;
	public static final int KAKKO_L = 5;
	public static final int KAKKO_R = 6;
	
	public static class Token{
		String value;
		int type;
		
		public Token(String value, int type) {
			super();
			this.value = value;
			this.type = type;
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
			return inner.eval(mod) % mod;
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
			int inv = mod_pow(right.eval(mod), mod - 2, mod);
			
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
		}else if(tokens.peek().type == NUMBER){
			return new Const(Integer.parseInt(tokens.poll().value));
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
	
	public static void add_stack(String token, LinkedList<Token> stack){
		if("+".equals(token)){
			stack.add(new Token(token, ADD));
		}else if("-".equals(token)){
			stack.add(new Token(token, SUB));
		}else if("*".equals(token)){
			stack.add(new Token(token, MUL));
		}else if("/".equals(token)){
			stack.add(new Token(token, DIV));
		}else if(token.startsWith("(")){
			stack.add(new Token("(", KAKKO_L));
			
			if(token.length() > 1){
				add_stack(token.substring(1), stack);
			}
		}else if(token.endsWith(")")){
			if(token.length() > 1){
				add_stack(token.substring(0, token.length() - 1), stack);
			}
			stack.add(new Token(")", KAKKO_R));
			
		}else {
			stack.add(new Token(token, NUMBER));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			String input = sc.nextLine();
			
			if("0:".equals(input)){
				break;
			}
			
			String[] tokens = input.split(" ");
			
			//System.out.println(Arrays.toString(tokens));
			
			LinkedList<Token> stack = new LinkedList<Token>();
			for(int i = 1; i < tokens.length; i++){
				if(tokens[i] == ""){
					continue;
				}
				
				add_stack(tokens[i], stack);
			}	
			
			final int mod = Integer.parseInt(tokens[0].substring(0, tokens[0].length() - 1));
			
			Expr node = parse_1(stack);
			
			try{
				int result = node.eval(mod);
				
				System.out.println(node + " = " + result + " (mod " + mod + ")");
			}catch(ArithmeticException e){
				System.out.println("NG");
			}
			
			
		}
		
		sc.close();
	}
}