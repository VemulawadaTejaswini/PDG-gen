import java.util.Scanner;

public class Main {

	static char[] s;
	static int idx;
	static int[] PQR = {0,0,0};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			String str = cin.next();
			if(str.equals(".")){
				break;
			}
			s = (str+"     ").toCharArray();
			idx=0;
			int count=0;
			for(int i = 0;i <3;i++){
				for(int j = 0;j<3;j++){
					for(int k = 0;k<3;k++){
						idx=0;
						PQR[0]=i;
						PQR[1]=j;
						PQR[2]=k;
						if(formula()==2){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	static int formula(){
		int res = 0;
		if(s[idx]=='0'){
			res = 0;
			idx++;
		}
		else if(s[idx]=='1'){
			res = 1;
			idx++;
		}
		else if(s[idx]=='2'){
			res = 2;
			idx++;
		}
		else if(s[idx]=='P'){
			res = PQR[0];
			idx++;
		}
		else if(s[idx]=='Q'){
			res = PQR[1];
			idx++;
		}
		else if(s[idx]=='R'){
			res = PQR[2];
			idx++;
		}
		else if(s[idx]=='-'){
			idx++;
			res = minus(formula());
		}
		else if(s[idx]=='('){
			idx++;
			res = formula();
			if(s[idx]=='*'){
				idx++;
				res = and(res, formula());
			}
			else if(s[idx]=='+'){
				idx++;
				res = or(res, formula());
			}
			idx++;
		}
		return res;
	}
	static int minus(int a){
		if(a == 0){
			return 2;
		}
		else if(a==2){
			return 0;
		}
		else{
			return 1;
		}
	}
	static int and(int a, int b){
		if(a+b==4){
			return 2;
		}
		else if(a==0||b==0){
			return 0;
		}
		else{
			return 1;
		}
	}
	static int or(int a,int b){
		if(a+b==0){
			return 0;
		}
		else if(a==2||b==2){
			return 2;
		}
		else{
			return 1;
		}
	}
}