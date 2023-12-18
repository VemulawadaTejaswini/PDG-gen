import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
 
 
public class Main{
     
	public static interface Expr{
		int exec();
		boolean check();
	}
	
	public static class Plus implements Expr{
		Expr left;
		Expr right;
		
		public Plus(Expr left, Expr right){
			this.left = left;
			this.right = right;
		}

		@Override
		public int exec() {
			return left.exec() + right.exec();
		}
		
		@Override
		public boolean check(){
			return left != null && left.check() && right != null && right.check();
		}
		
		@Override
		public String toString(){
			return left + "+" + right;
		}
	}
	
	public static class Mult implements Expr{
		Expr left;
		Expr right;
		
		public Mult(Expr left, Expr right){
			this.left = left;
			this.right = right;
		}

		@Override
		public int exec() {
			return left.exec() * right.exec();
		}
		
		@Override
		public boolean check(){
			return left != null && left.check() && right != null && right.check();
		}
		
		@Override
		public String toString(){
			return left + "*" + right;
		}
	}
	
	public static class Minus implements Expr{
		Expr left;
		Expr right;
		
		public Minus(Expr left, Expr right){
			this.left = left;
			this.right = right;
		}

		@Override
		public int exec() {
			return left.exec() - right.exec();
		}
		
		@Override
		public boolean check(){
			return left != null && left.check() && right != null && right.check();
		}
		
		@Override
		public String toString(){
			return left + "-" + right;
		}
	}
	
	public static class Kakko implements Expr{
		Expr ops;
		
		public Kakko(Expr ops){
			this.ops = ops;
		}

		@Override
		public int exec() {
			return ops.exec();
		}
		
		@Override
		public boolean check(){
			return ops != null && ops.check();
		}
		
		@Override
		public String toString(){
			return "(" + ops + ")";
		}
	}
	
	public static class Number implements Expr{
		int number;
		
		public Number(int n){
			number = n;
		}
		
		@Override
		public int exec() {
			return number;
		}
		
		@Override
		public boolean check(){
			return true;
		}
		
		@Override
		public String toString(){
			return number + "";
		}
	}
	
	public static Expr parse(char[] input, int start, int end){
		
		int k_lv = 0;
		int k_s = -1;
		int k_e = -1;
		int mi_lv = Integer.MAX_VALUE;
		int mi_p = -1;
		int ad_lv = Integer.MAX_VALUE;
		int ad_p = -1;
		int ml_lv = Integer.MAX_VALUE;
		int ml_p = -1;
		
		for(int pos = start; pos <= end; pos++){
			if(input[pos] == '('){
				if(k_lv == 0){
					k_s = pos;
				}
				
				k_lv++;
			}else if(input[pos] == ')'){
				k_lv--;
				
				if(k_lv == 0){
					k_e = pos;
					break;
				}else if(k_lv < 0){
					return null;
				}
			}else if(input[pos] == '+' && ad_lv >= k_lv){
				if(ad_lv == k_lv){
					return null;
				}
				ad_lv = k_lv;
				ad_p = pos;
			}else if(input[pos] == '-' && mi_lv >= k_lv){
				if(mi_lv == k_lv){
					return null;
				}
				mi_lv = k_lv;
				mi_p = pos;
			}else if(input[pos] == '*' && ml_lv >= k_lv){
				if(ml_lv == k_lv){
					return null;
				}
				ml_lv = k_lv;
				ml_p = pos;
			}
		}
		
		if(k_lv != 0){
			return null;
		}
		/*
		if(mi_lv == ad_lv || mi_lv == ml_lv || ad_lv == ml_lv){
			return null;
		}
		*/
		if(k_s == start && k_e == end){
			if(mi_lv < ad_lv && mi_lv < ml_lv){
				return new Kakko(new Minus(parse(input, k_s + 1, mi_p - 1), parse(input, mi_p + 1, k_e - 1)));
			}else if(ad_lv < mi_lv && ad_lv < ml_lv){
				return new Kakko(new Plus(parse(input, k_s + 1, ad_p - 1), parse(input, ad_p + 1, k_e - 1)));
			}else if(ml_lv < ad_lv && ml_lv < mi_lv){
				return new Kakko(new Mult(parse(input, k_s + 1, ml_p - 1), parse(input, ml_p + 1, k_e - 1)));
			}
		}else if(k_s == start){
			if(mi_lv < ad_lv && mi_lv < ml_lv){
				if(ad_lv < ml_lv){
					return new Minus(new Kakko(new Plus(parse(input, k_s + 1, ad_p - 1), parse(input, ad_p + 1, k_e - 1))), parse(input, mi_p + 1, end));
				}else{
					return new Minus(new Kakko(new Mult(parse(input, k_s + 1, ml_p - 1), parse(input, ml_p + 1, k_e - 1))), parse(input, mi_p + 1, end));
				}
			}else if(ad_lv < mi_lv && ad_lv < ml_lv){
				if(mi_lv < ml_lv){
					return new Plus(new Kakko(new Minus(parse(input, k_s + 1, mi_p - 1), parse(input, mi_p + 1, k_e - 1))), parse(input, ad_p + 1, end));
				}else{
					return new Plus(new Kakko(new Mult(parse(input, k_s + 1, ml_p - 1), parse(input, ml_p + 1, k_e - 1))), parse(input, ad_p + 1, end));
				}
			}else if(ml_lv < ad_lv && ml_lv < mi_lv){
				if(ad_lv < mi_lv){
					return new Mult(new Kakko(new Plus(parse(input, k_s + 1, ad_p - 1), parse(input, ad_p + 1, k_e - 1))), parse(input, ml_p + 1, end));
				}else{
					return new Mult(new Kakko(new Minus(parse(input, k_s + 1, mi_p - 1), parse(input, mi_p + 1, k_e - 1))), parse(input, ml_p + 1, end));
				}
			}
		}else if(k_e == end){
			if(mi_lv < ad_lv && mi_lv < ml_lv){
				if(ad_lv < ml_lv){
					return new Minus(parse(input, start, mi_p - 1), new Kakko(new Plus(parse(input, k_s + 1, ad_p - 1), parse(input, ad_p + 1, k_e - 1))));
				}else{
					return new Minus(parse(input, start, mi_p - 1), new Kakko(new Mult(parse(input, k_s + 1, ml_p - 1), parse(input, ml_p + 1, k_e - 1))));
				}
			}else if(ad_lv < mi_lv && ad_lv < ml_lv){
				if(mi_lv < ml_lv){
					return new Plus(parse(input, start, ad_p - 1), new Kakko(new Minus(parse(input, k_s + 1, mi_p - 1), parse(input, mi_p + 1, k_e - 1))));
				}else{
					return new Plus(parse(input, start, ad_p - 1), new Kakko(new Mult(parse(input, k_s + 1, ml_p - 1), parse(input, ml_p + 1, k_e - 1))));
				}
			}else if(ml_lv < ad_lv && ml_lv < mi_lv){
				if(ad_lv < mi_lv){
					return new Mult(parse(input, start, ml_p - 1), new Kakko(new Plus(parse(input, k_s + 1, ad_p - 1), parse(input, ad_p + 1, k_e - 1))));
				}else{
					return new Mult(parse(input, start, ml_p - 1), new Kakko(new Minus(parse(input, k_s + 1, mi_p - 1), parse(input, mi_p + 1, k_e - 1))));
				}
			}
		}else{
			if(mi_p != -1){
				return new Minus(parse(input, start, mi_p - 1), parse(input, mi_p + 1, end));
			}else if(ad_p != -1){
				return new Plus(parse(input, start, ad_p - 1), parse(input, ad_p + 1, end));
			}else if(ml_p != -1){
				return new Mult(parse(input, start, ml_p - 1), parse(input, ml_p + 1, end));
			}else if(start <= end){
				int num = 0;
				for(int i = start; i <= end; i++){
					num *= 2;
					num += input[i] - '0';
				}
				
				return new Number(num);
			}else{
				return null;
			}
		}
		
		return null;
	}
	
	public static char[] rep = new char[]{'(', ')', '+', '-', '*', '0', '1'};
	
	public static int search(char[] input, int deep, int count, int[] pos){
		if(deep == count){
			Expr expr = parse(input, 0, input.length - 1);
			
			//System.out.println(Arrays.toString(input) + " " + expr);
			
			if(expr == null || !expr.check()){
				return -1;
			}else{
				return expr.exec();
			}
		}else{
			int max = -1;
			for(char c : rep){
				input[pos[deep]] = c;
				
				max = Math.max(max, search(input, deep + 1, count, pos));
			}
			
			return max;
		}
	}
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
         
    	char[] input = sc.next().toCharArray();
    	
    	int count = 0;
    	for(char c : input){
    		if(c == '.'){
    			count++;
    		}
    	}
    	
    	int[] pos = new int[count];
    	int t = 0;
    	for(int i = 0; i < input.length; i++){
    		if(input[i] == '.'){
    			pos[t++] = i;
    		}
    	}
    	
    	System.out.println(search(input, 0, count, pos));
    }
     
}