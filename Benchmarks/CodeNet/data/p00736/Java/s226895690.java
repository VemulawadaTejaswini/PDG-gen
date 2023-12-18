import java.util.Scanner;

public class Main {

	static char[] s;
	static int idx,p,q,r;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			s=(cin.next()+"     ").toCharArray();
			if(s[0]=='.')break;
			int ans=0;
			
			for(p=0;p<=2;p++){
				for(q=0;q<=2;q++){
					for(r=0;r<=2;r++){
						idx=0;
						if(formula()==2){
							ans++;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
	static int formula(){
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
		else if(s[idx]=='P'){
			idx++;
			return p;
		}
		else if(s[idx]=='Q'){
			idx++;
			return q;
		}
		else if(s[idx]=='R'){
			idx++;
			return r;
		}
		else if(s[idx]=='-'){
			idx++;
			return minus(formula());
		}
		else if(s[idx]=='('){
			idx++;
			int a=formula();
			if(s[idx]=='*'){
				idx++;
				a=mult(a,formula());
				idx++;
				return a;
			}
			else{
				idx++;
				a=add(a,formula());
				idx++;
				return a;
			}
		}
		System.out.println("aaaaaaaa");
		return 0;
	}
	static int mult(int a,int b){
		if(a==0||b==0)return 0;
		if(a+b==4)return 2;
		return 1;
	}
	static int add(int a,int b){
		if(a==2||b==2){
			return 2;
		}
		if(a+b==1){
			return 1;
		}
		if((a|b)==1){
			return 1;
		}
		if((a|b)==0){
			return 0;
		}
		return 0;
	}
	static int minus(int a){
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

}