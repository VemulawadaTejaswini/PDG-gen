import java.util.*;
import java.awt.geom.*;
public class Main {
	//2030 start
	
	class C{
		int num, i;

		public C(int num, int i) {
			this.num = num;
			this.i = i;
		}

		@Override
		public String toString() {
			if(num == 0 && i == 0){
				return "0";
			}
			else if(i == 0){
				return num + "";
			}
			else if(num == 0){
				if(i == 1){
					return "i";
				}
				return i + "i";
			}
			else{
				StringBuilder ans = new StringBuilder();
				ans.append(num);
				if(i > 0) ans.append("+");
				if(i != 1)ans.append(i);
				ans.append("i");
				return ans.toString();
			}
		}
		
	}
	
	class Parse{
		String str;
		int pos;
		boolean flg;
		public Parse(String str){
			this.str = str;	pos = 0;
			flg = false;
		}
		
		private C exp() {
			C res = term();
			//System.out.println("res = " + res);
			while(true){
				char op = str.charAt(pos);
				if((op == '+') || (op == '-')){
					C old = new C(res.num, res.i);
					pos++;
					res = term();
					
					switch(op){
					case '+': 
						res.num = old.num + res.num;
						res.i = old.i + res.i;
						break;
					case '-':
						res.num = old.num - res.num;
						res.i = old.i - res.i;
						break;
					}
					check(res.num);
					check(res.i);
				}
				else break;
			}
			return res;
		}

		private C term() {
			C res = fact();
			while(true){
				char op = str.charAt(pos);
				if((op == '*') || (op == '/')){
					C old = new C(res.num, res.i);
					pos++;
					res = fact();
					switch(op){
					case '*':
						int tempnum = old.num * res.num - old.i * res.i;
						int tempi = old.i * res.num + old.num * res.i;
						check(tempnum);
						check(tempi);
						res = new C(tempnum, tempi);
						break;
					}
				}
				else break;
			}
			return res;
		}

		private void check(int num) {
			if(-10000 <= num && num <=  10000){
			}
			else{
				flg = true;
			}
			return;
		}

		private C fact() {
			if(Character.isDigit(str.charAt(pos))){
				int t = str.charAt(pos) - '0';
				pos++;
				while(Character.isDigit(str.charAt(pos))){
					t = t * 10 + (str.charAt(pos) - '0');
					check(t);
					pos++;
				}
				return new C(t, 0);
			}
			else if(str.charAt(pos) == 'i'){
				pos++;
				return new C(0, 1);
			}
			else if(str.charAt(pos) == '('){
				pos++;
				C res = exp();
				pos++;
				return res;
			}
			return null;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			Parse p = new Parse(s + "$");
			C res = p.exp();
			if(p.flg){
				System.out.println("overflow");
			}
			else{
				System.out.println(res);
			}
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}