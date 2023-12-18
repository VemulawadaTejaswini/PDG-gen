import java.util.Scanner;

// 7/26

public class Main {

	/**
	 * @param args
	 */
	static char[] s;
	static int idx;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			idx=0;
			String str = cin.next();
			if(str.equals(".")){
				break;
			}
			int count=0;
			for(int i = 0; i < 3;i++){
				for(int j = 0;j < 3;j++){
					for(int k =0; k < 3;k++){
						idx=0;
						String a = str.replace('P', (char)('0'+i));
						a = a.replace('Q', (char)('0'+j));
						a = a.replace('R', (char)('0'+k));
						s = new char[a.length()+100];
						for(int m= 0; m < a.length();m++){
							s[m]=a.charAt(m);
						}
						//System.out.println(s);
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
			res = and(res, fact());
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
		else if(s[idx]=='-'){
			idx++;
			res = bikkuri(fact());
		}
		else{
			return variable();
		}
		return res;
	}
	static int variable(){
		if(s[idx]=='0'){
			idx++;
			return 0;
		}
		else if(s[idx]=='1'){
			idx++;
			return 1;
		}
		else if(s[idx]=='2'){
			idx++;
			return 2;
		}
		else
			return -1;
	}
	static int bikkuri(int a){
		if(a==0){
			return 2;
		}
		else if(a==2){
			return 0;
		}
		else{
			return 1;
		}
	}
	static int or(int a,int b){
		if(a==2||b==2){
			return 2;
		}
		else if(a+b==0){
			return 0;
		}
		else
			return 1;
	}
	static int and(int a,int b){
		if(a==0||b==0){
			return 0;
		}
		else if(a+b==4){
			return 2;
		}
		else{
			return 1;
		}
	}
}