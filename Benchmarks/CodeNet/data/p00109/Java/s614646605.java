import java.util.Scanner;

public class Main {

	static char[] s;
	static int idx;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while(N--!=0){
			String str = cin.next();
			idx=0;
			s = new char[101];
			for(int i = 0; i < str.length(); i++){
				s[i]=str.charAt(i);
			}
			System.out.println(expression());
		}
	}
	static int expression(){
		int res = term();
		while(s[idx]=='+'||s[idx]=='-'){
			if(s[idx]=='+'){
				idx++;
				res += term();
			}
			else{
				idx++;
				res -= term();
			}
		}
		return res;
	}
	static int term(){
		int res = fact();
		while(s[idx]=='*' || s[idx]=='/'){
			if(s[idx]=='*'){
				idx++;
				res *= fact();
			}
			else{
				idx++;
				res /= fact();
			}
		}
		return res;
	}
	static int fact(){
		int res;
		if(s[idx]=='('){
			idx++;
			res = expression();
			idx++;
		}
		else{
			res = s[idx++]-'0';
		}
		return res;
	}
	static int kagen(){
		int res = joujo();
		if(s[idx]=='+'){
			idx++;
			return res +term();
		}
		else if(s[idx]=='-'){
			idx++;
			return res -term();
		}
		return res;
	}
	static int joujo(){
		int res =  value();
		
		if(s[idx]=='*'){
			idx++;
			res *=value();
			return res*term();
		}
		else if(s[idx]=='/'){
			idx++;
			return res /value();
		}
		return res;
	}
	static int value(){
		int res=0;
		if(s[idx]=='('){
			idx++;
			res=term();
			idx++;
		}
		else{
			res = s[idx++]-'0';
		}
		return res;
	}
}