import java.util.*;
import java.awt.geom.*;
import java.io.*;

public class Main{
	int p,q,r;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.next() + "#";
			if(s.equals(".#")) break;
			 p = 0;
			 q = 0;
			 r = 0;
			 int count = 0;
			 
			 for(p = 0; p < 3; p++){
				 for(q = 0; q < 3; q++){
					 for(r = 0; r < 3; r++){
						 int res = new Parse(s + "", 0).exp();
						 if(res == 2){
							 count++;
						 }
					 }
				 }
			 }
			 System.out.println(count);
		}
		
	}
	
	class Parse{
		String str;
		int pos;
		
		public Parse(String str, int pos) {
			this.str = str;
			this.pos = pos;
		}


		private int exp() {
			int res = fact();
			while(true){
				char op = str.charAt(pos);
				if((op == '+') || (op == '*')){
					int old = res;
					pos++;
					res = fact();
					switch(op){
					case '+':
						res = Math.max(old, res);
						break;
					case '*':
						res = Math.min(old, res);
						break;
					}
				}
				else{
					break;
				}
			}
			return res;
		}


		private int fact() {
			if(Character.isDigit(str.charAt(pos))){
				int t = str.charAt(pos) - '0';
				pos++;
				return t;
			}
			else if(str.charAt(pos) == '('){
				pos++;
				int res = exp();
				pos++;
				return res;
			}
			else if(str.charAt(pos) == '-'){
				pos++;
				int res = fact();
				if(res == 0){
					res = 2;
				}
				else if(res == 1){
					res  = 1;
				}
				else{
					res = 0;
				}
				return res;
			}
			else if(str.charAt(pos) == 'P'){
				pos++;
				return p;
			}
			else if(str.charAt(pos) == 'Q'){
				pos++;
				return q;
			}
			else if(str.charAt(pos) == 'R'){
				pos++;
				return r;
			}
			//dead code
			return 0;
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}