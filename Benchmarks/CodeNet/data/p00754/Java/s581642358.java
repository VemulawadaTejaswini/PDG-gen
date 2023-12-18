import java.util.*;
class Main{
	static String a;
	static boolean solve(int p,int q){
	//	System.out.println(p+" "+q);
		if(p==q)return true;
		boolean ok=false;
		if(a.charAt(p)==')')return false;
		else if(a.charAt(p)==']')return false;
		else if(a.charAt(p)=='('){
			int c=0;
			for(int i=p;i<q;i++){
				if(a.charAt(i)=='(')c++;
				if(a.charAt(i)==')')c--;
				if(c==0){
					if(solve(p+1,i)&&solve(i+1,q))ok=true;
					break;
				}
			}
		}else if(a.charAt(p)=='['){
			int c=0;
			for(int i=p;i<q;i++){
				if(a.charAt(i)=='[')c++;
				if(a.charAt(i)==']')c--;
				if(c==0){
					if(solve(p+1,i)&&solve(i+1,q))ok=true;
					break;
				}
			}
		}
		return ok;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(true){
			String str=s.nextLine();
			if(str.equals("."))System.exit(0);
			a="";
			for(int i=0;i<str.length();i++)if(str.charAt(i)=='('||str.charAt(i)==')'||str.charAt(i)=='['||str.charAt(i)==']')a=a+str.charAt(i);
		//	System.out.println(a);
			System.out.println(solve(0,a.length())?"yes":"no");
		}
	}
}