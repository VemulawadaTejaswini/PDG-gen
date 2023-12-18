import java.io.*;
import java.util.*;


public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new A().doIt();
	}
	class A{
		String str;
		int pos;
		void doIt(){
			int n = sc.nextInt();
			for(int i = 0;i < n;i++){
				str = sc.next();
				pos = 0;
				System.out.println(exp());
			}
		}
		int exp() {
			int res = term();
			while(true){
				char op = str.charAt(pos);
				if(op != '+' && op != '-')break;
				int old = res;
				pos++;
				res = term();
				if(op == '+')res = old + res;
				else res = old - res;
			}
			return res;
		}
		
		int term(){
			int res = fact();
			while(true){
				char op = str.charAt(pos);
				if(op != '*' && op != '/')break;
				int old = res;
				pos++;
				res = fact();
				if(op == '*')res = old * res;
				else res = old / res;
			}
			return res;
		}
		
		int fact(){
			if(Character.isDigit(str.charAt(pos))){
	            int t = str.charAt(pos) - '0';
	            pos++;
	            while(Character.isDigit(str.charAt(pos))){
	                t = t * 10 + (str.charAt(pos) - '0');
	                pos++; 
	            }
	            return t; 
	        }
	        else if(str.charAt(pos) == '('){
	            pos++;
	            int res = exp();
	            pos++;
	            return res;
	        }
			return 0;
		}
	}
}