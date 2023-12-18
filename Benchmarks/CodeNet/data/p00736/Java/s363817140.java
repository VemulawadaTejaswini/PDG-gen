import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static interface Expr{
		public int exec(int p, int q, int r);
	}
	
	public static class Number implements Expr{
		int num;
		
		public Number(int n){
			num = n;
		}
		
		public int exec(int p, int q, int r){
			return num;
		}
	}
	
	public static class Val implements Expr{
		int num;
		
		public Val(int n){
			num = n;
		}
		
		public int exec(int p, int q, int r){
			if(num == 0){
				return p;
			}else if(num == 1){
				return q;
			}else if(num == 2){
				return r;
			}
			
			return -1;
		}
	}
	
	public static class Minus implements Expr{
		Expr inner;
		
		public Minus(Expr in){
			inner = in;
		}
		
		public int exec(int p, int q, int r){
			return 2 - inner.exec(p,q,r);
		}
	}
	
	public static class Plus implements Expr{
		Expr le, ri;
		
		public Plus(Expr l, Expr r){
			le = l;
			ri = r;
		}
		
		public int exec(int p, int q, int r){
			return Math.max(le.exec(p, q, r), ri.exec(p, q, r));
		}
	}
	
	public static class Mult implements Expr{
		Expr le, ri;
		
		public Mult(Expr l, Expr r){
			le = l;
			ri = r;
		}
		
		public int exec(int p, int q, int r){
			return Math.min(le.exec(p, q, r), ri.exec(p, q, r));
		}
	}
	
	public static Expr parse(char[] input, int start, int end){
		int c_level = 0;
		int op_pos = -1;
		int op_type = -1;
		int c_start = start, c_end = end;
		
		for(int i = start; i <= end; i++){
			if(c_level == 0 && input[i] == '-' && op_pos == -1){
				op_type = 0;
				op_pos = i;
				c_start = i;
				c_end++;
			}else if(input[i] == '('){
				if(c_start == -1){
					c_start = i;
				}
				c_level++;
			}else if(input[i] == ')'){
				c_level--;
				if(c_level == 0){
					c_end = i;
					break;
				}
			}else if(c_level == 1 && input[i] == '*'){
				op_pos = i;
				op_type = 2;
			}else if(c_level == 1 && input[i] == '+'){
				op_pos = i;
				op_type = 1;
			}
		}
		
		if(op_type == 0){
			return new Minus(parse(input, c_start + 1, c_end - 1));
		}else if(op_type == 1){
			return new Plus(parse(input,c_start + 1, op_pos - 1),parse(input,op_pos + 1, c_end - 1));
		}else if(op_type == 2){
			return new Mult(parse(input,c_start + 1, op_pos - 1),parse(input,op_pos + 1, c_end - 1));
		}else{
			if(input[start] == '0' || input[start] == '1' || input[start] == '2'){
				return new Number(input[start] - '0');
			}else{
				return new Val(input[start] - 'P');
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String input = sc.next();
			
			if(".".equals(input)){
				break;
			}
			
			Expr tree = parse(input.toCharArray(), 0, input.length() - 1);
			
			int count = 0;
			
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					for(int k = 0; k < 3; k++){
						if(tree.exec(i, j, k) == 2){
							count++;
						}
					}
				}
			}
			
			System.out.println(count);
		}
	}

}