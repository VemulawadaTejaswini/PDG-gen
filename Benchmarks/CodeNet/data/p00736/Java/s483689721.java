import java.util.Scanner;

public class Main1 {

	static char[] s;
	static char[] var;
	static int[] PQR;
	static int[] tuf = {0, 1, 2};// true, unknown, false
	static int idx;
	static int varCount;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			varCount=idx=0;
			String str = cin.next();
			if(str.equals(".")){
				break;
			}
			s = new char[80];
			var = new char[80];
			PQR=new int[3];
			for(int i = 0; i < str.length(); i++){
				char c = str.charAt(i);
				if(c == '-' || c == '*' || c == '+' || c == '(' || c == ')'){
					s[idx++]=c;
				}
				else if(c=='P'){
					var[varCount++]=0;
				}
				else if(c=='Q'){
					var[varCount++]=1;
				}
				else if(c=='R'){
					var[varCount++]=2;
				}
				else if(c=='0'){
					var[varCount++]=3;
				}
				else if(c=='1'){
					var[varCount++]=4;
				}
				else if(c=='2'){
					var[varCount++]=5;
				}
			}

			int count=0;
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					for(int k = 0; k < 3; k++){
						varCount=idx=0;
						PQR[0]=tuf[i];
						PQR[1]=tuf[j];
						PQR[2]=tuf[k];
						if(expression()==2){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	static int expression(){
		int res = term();
		if(s[idx]=='+'){
			idx++;
			res = or(res, expression());
		}
		return res;
	}
	static int term(){
		int res = fact();
		if(s[idx]=='*'){
			idx++;
			res = and(res, term());
		}
		return res;
	}
	static int fact(){
		int res;
		if(s[idx]=='('){
			idx++;
			res=expression();
			idx++;
		}
		else if(s[idx]=='-'){
			idx++;
			res = not(fact());
		}
		else{
			res = variable();
		}
		return res;
	}
	static int variable(){
		if(var[varCount]>=3){
			return var[varCount++]-3;
		}
		return PQR[var[varCount++]];
	}
	static int or(int x, int y){
		if(x <= 1 && y <= 1){
			if(x == 0 && y == 0){
				return 0;
			}
			else{
				return 1;
			}
		}
		else{
			return 2;
		}
		
	}
	static int and(int x, int y){
		if(x >= 1 && y >= 1){
			if(x == 2 && y == 2){
				return 2;
			}
			else{
				return 1;
			}
		}
		else{
			return 0;
		}
	}
	static int not(int x){
		if(x ==0){
			return 2;
		}
		else if(x==1){
			return 1;
		}
		else{
			return 0;
		}
	}
}