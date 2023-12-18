import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new B().doIt();
	}
	
	
	class B{
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
		
		int left_to_right(){
//			System.out.println(Arrays.toString(line));
			int result = Integer.parseInt(line[0]+"");
			for(int i=1;i<line.length-1;i+=2){
				if(line[i]=='+'){
					result += Integer.parseInt(line[i+1]+"");
				}else{
					result *= Integer.parseInt(line[i+1]+"");
				}
			}
			return result;
		}
		
		void doIt(){
			line = (in.next()+"=").toCharArray();
			pos = 0;
			int a = exp();
			int b = left_to_right();
			int c = in.nextInt();
			if(a == b&&a == c)System.out.println("U");
			else if(a == c)System.out.println("M");
			else if(b==c)System.out.println("L");
			else System.out.println("I");
		}
	}
	
}