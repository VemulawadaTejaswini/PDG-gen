import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(true){
			String input = in.next();
			if(input.equals("."))break;
			new AOJ1155().doIt(input+"=");
		}
	}
	class AOJ1155{
		char[] line;
		int pos;
		int P,Q,R;
		int exp(){
//			System.out.println("exp-- "+pos);
			int r = term();
//			System.out.println("exp-- "+r);
			while(true){
				char c = line[pos++];
				if(c=='+'){
					int a = term();
					if(r==2||a==2)r = 2;
					else if(r==1||a==1)r=1;
					else r = 0;
				}else if(c=='*'){
					int a = term();
					r = Math.min(a, r);
				}
				else break;
			}
			return r;
		}

		int term(){
			return fact();
		}

		int fact(){
			char c = line[pos++];
			if(c=='(')return exp();
			if(c=='-'){
				int a = fact();
				return Math.abs(a-2);
			}
			if(c=='P')return P;
			if(c=='Q')return Q;
			if(c=='R')return R;
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
		
		void doIt(String input){
			line = input.toCharArray();
			int cnt = 0;
			for(P=0;P<3;P++)for(Q=0;Q<3;Q++)for(R=0;R<3;R++){
//				System.out.println(P+" "+Q+" "+R);
				pos = 0;
				if(exp()==2)cnt++;
			}
			System.out.println(cnt);
		}
		
	}
}