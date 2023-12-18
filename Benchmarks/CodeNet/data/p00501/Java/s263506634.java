import java.util.Scanner;

public class Main {

	static int N;
	static String ans;
	static String s;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		N=cin.nextInt();
		ans=cin.next();
		int cnt=0;
		for(int i=0;i<N;i++){
			s=cin.next();
			if(c(ans,s))cnt++;
		}
		
		System.out.println(cnt);
	}
	static boolean c(String a,String s){
		if(a.equals(s))return true;
//		System.out.println(s);
		for(int i=0;i<s.length();i++){
			for(int j=0;j<=i;j++){
				String n="";
				for(int k=j;k<s.length();k+=1+i){
					n+=s.charAt(k);
				}
//				System.out.println("  "+n);
				if(n.indexOf(a)!=-1){
//					System.out.println(s);
//					System.out.println(n);
					return true;
				}
			}
		}
		return false;
	}
}