import java.awt.geom.Point2D;
import java.lang.Character.Subset;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0109();
	}

	class AOJ0109{
		char[] line;
		int pos;

		int exp(){
			int r = term();
			while(true){
				char c = line[pos++];
				if(c=='+')r+=term();
				else if(c=='-')r-=term();
				else break;
			}
			return r;
		}

		int term(){
			int r = fact();
			while(true){
				char c = line[pos++];
				if(c=='*') r*=fact();
				else if(c=='/')r/=fact();
				else break;
			}
			pos--;
			return r;
		}

		int fact(){
			char c = line[pos++];
			if(c=='(')return exp();
			if(c=='-')return -fact();
			if(c=='+')return fact();
			int x = c-'0';
			while(true){
				c = line[pos++];
				if(Character.isDigit(c)){
					x *= 10;
					x += c-'0';
				}
				else break;
			}
			pos--;
			return x;
		}
		void doIt(){
			String a = in.next();
			line = a.toCharArray();
			pos = 0;
			System.out.println(exp());
		}

		public AOJ0109() {
			int n = in.nextInt();
			while(n--!=0)doIt();
		}
	}
}