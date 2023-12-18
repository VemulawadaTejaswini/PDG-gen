import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

import javax.xml.bind.ParseConversionEvent;

public class Main {

	public static interface Expr{
		public boolean eval(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h, boolean i, boolean j, boolean k);
	}
	
	public static class T implements Expr{
		
		public String toString(){
			return "T";
		}
		
		@Override
		public boolean eval(boolean a, boolean b, boolean c, boolean d,
				boolean e, boolean f, boolean g, boolean h, boolean i,
				boolean j, boolean k) {
			return true;
		}
	}

	public static class F implements Expr{
		
		public String toString(){
			return "F";
		}
		
		@Override
		public boolean eval(boolean a, boolean b, boolean c, boolean d,
				boolean e, boolean f, boolean g, boolean h, boolean i,
				boolean j, boolean k) {
			return false;
		}
	}
	
	public static class Var implements Expr{
		int num;
		
		public Var(int a){
			num = a;
		}
		
		public String toString(){
			return Character.toString((char) ('a' + num));
		}
		
		@Override
		public boolean eval(boolean a, boolean b, boolean c, boolean d,
				boolean e, boolean f, boolean g, boolean h, boolean i,
				boolean j, boolean k) {
			switch(num){
			case 0:
				return a;
			case 1:
				return b;
			case 2:
				return c;
			case 3:
				return d;
			case 4:
				return e;
			case 5:
				return f;
			case 6:
				return g;
			case 7:
				return h;
			case 8:
				return i;
			case 9:
				return j;
			case 10:
				return k;
			default: 
				return false;
			}
		}
	}
	
	public static class Not implements Expr{
		private Expr inner;
		
		public Not(Expr e){
			inner = e;
		}
		
		public String toString(){
			return "~" + inner.toString();
		}
		
		@Override
		public boolean eval(boolean a, boolean b, boolean c, boolean d,
				boolean e, boolean f, boolean g, boolean h, boolean i,
				boolean j, boolean k) {
			return !inner.eval(a, b, c, d, e, f, g, h, i, j, k);
		}
	}
	
	public static class And implements Expr{
		private Expr inner_l, inner_r;
		
		
		public And(Expr e_l, Expr e_r){
			inner_l = e_l;
			inner_r = e_r;
		}
		
		public String toString(){
			return "(" + inner_l.toString() + " * " + inner_r.toString() + ")";
		}
		
		@Override
		public boolean eval(boolean a, boolean b, boolean c, boolean d,
				boolean e, boolean f, boolean g, boolean h, boolean i,
				boolean j, boolean k) {
			return inner_l.eval(a, b, c, d, e, f, g, h, i, j, k) && inner_r.eval(a, b, c, d, e, f, g, h, i, j, k);
		}
	}
	
	public static class Or implements Expr{
		private Expr inner_l, inner_r;
		
		
		public Or(Expr e_l, Expr e_r){
			inner_l = e_l;
			inner_r = e_r;
		}
		
		public String toString(){
			return "(" + inner_l.toString() + " + " + inner_r.toString() + ")";
		}
		
		@Override
		public boolean eval(boolean a, boolean b, boolean c, boolean d,
				boolean e, boolean f, boolean g, boolean h, boolean i,
				boolean j, boolean k) {
			return inner_l.eval(a, b, c, d, e, f, g, h, i, j, k) || inner_r.eval(a, b, c, d, e, f, g, h, i, j, k);
		}
	}
	
	public static class Conj implements Expr{
		private Expr inner_l, inner_r;
		
		
		public Conj(Expr e_l, Expr e_r){
			inner_l = e_l;
			inner_r = e_r;
		}
		
		public String toString(){
			return "(" + inner_l.toString() + " -> " + inner_r.toString() + ")";
		}
		
		@Override
		public boolean eval(boolean a, boolean b, boolean c, boolean d,
				boolean e, boolean f, boolean g, boolean h, boolean i,
				boolean j, boolean k) {
			return !inner_l.eval(a, b, c, d, e, f, g, h, i, j, k) || inner_r.eval(a, b, c, d, e, f, g, h, i, j, k);
		}
	}
	
	public static Expr parse(char[] input, int start, int end){
		int s_level = 0;
		int s_start = start, s_end = end;
		int op_num = -1, op_pre = -1, op_post = -1;
		
		for(int i = start; i <= end; i++){
			if(input[i] == '('){
				if(s_level == 0){
					s_start = i+1;
				}
				
				s_level++;
				
			}else if(input[i] == ')'){
				s_level--;
				
				if(s_level == 0){
					s_end = i-1;
				}
			}else if(op_num == -1 && s_level == 1 && input[i] == '+'){
				op_num = 0;
				op_pre = i - 1;
				op_post = i + 1;
			}else if(op_num == -1 && s_level == 1 && input[i] == '*'){
				op_num = 1;
				op_pre = i - 1;
				op_post = i + 1;
			}else if(op_num == -1 && s_level == 0 && input[i] == '-'){
				op_num = 2;
				op_pre = i - 1;
				op_post = i + 1;
			}else if(op_num == -1 && s_level == 1 && input[i] == '-' && input[i+1] == '>'){
				op_num = 3;
				op_pre = i - 1;
				op_post = i + 2;
			}
		}
		
		if(op_num == 0){
			return new Or(parse(input, s_start, op_pre), parse(input, op_post, s_end));
		}else if(op_num == 1){
			return new And(parse(input, s_start, op_pre), parse(input, op_post, s_end));
		}else if(op_num == 2){
			return new Not(parse(input, op_post, s_end));
		}else if(op_num == 3){
			return new Conj(parse(input, s_start, op_pre), parse(input, op_post, s_end));
		}else{
			if(input[start] == 'T'){
				return new T();
			}else if(input[start] == 'F'){
				return new F();
			}else{
				return new Var(input[start] - 'a');
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String input = sc.next();
			
			if("#".equals(input)){
				break;
			}
			
			String[] inputs = input.split("=");
			
			boolean flag = true;
			
			Expr right = parse(inputs[0].toCharArray(), 0, inputs[0].length()-1);
			Expr left = parse(inputs[1].toCharArray(), 0, inputs[1].length()-1);
			
			//System.out.println(right);
			//System.out.println(left);
			
			END:
			for(int a = 0; a < 2; a++){
				for(int b = 0; b < 2; b++){
					for(int c = 0; c < 2; c++){
						for(int d = 0; d < 2; d++){
							for(int e = 0; e < 2; e++){
								for(int f = 0; f < 2; f++){
									for(int g = 0; g < 2; g++){
										for(int h = 0; h < 2; h++){
											for(int i = 0; i < 2; i++){
												for(int j = 0; j < 2; j++){
													for(int k = 0; k < 2; k++){
														if(right.eval(a == 1, b == 1, c == 1, d == 1, e == 1, f == 1, g == 1, h == 1, i == 1, j == 1, k == 1)
															!=
															left.eval(a == 1, b == 1, c == 1, d == 1, e == 1, f == 1, g == 1, h == 1, i == 1, j == 1, k == 1)){
															
															flag = false;
															break END;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			System.out.println(flag ? "YES" : "NO");
		}

	}

}