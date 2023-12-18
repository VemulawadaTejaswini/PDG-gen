import java.util.Scanner;

public class Main {

	static int N;
	static String start;
	static String[] s;
	static boolean ans;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			ans=false;
			N=cin.nextInt();
			if(N==0)break;
			s=new String[N];
			for(int i=0;i<N;i++){
				s[i]=cin.next();
//				System.out.println(s[i]);
			}
			for(int i=0;i<N;i++){
//				System.out.println(i+" "+s[i]);
				start=s[i].toString();
				s[i]=null;
				bt(i,start,1);
				s[i]=start;
			}
			if(ans){
				System.out.println("OK");
			}
			else{
				System.out.println("NG");	
			}
		}
	}
	static void bt(int a,String before,int step){
//		System.out.println(a+" "+before+" "+step);
		if(step==N){
			if(before.charAt(before.length()-1)==start.charAt(0))
				ans=true;
		}
		for(int i=0;i<N;i++){
			if(s[i]==null)continue;
			if(s[i].charAt(0)==before.charAt(before.length()-1)){
				String tmp=s[i];
				s[i]=null;
				bt(i,tmp,step+1);
				s[i]=tmp;
			}
		}
	}
}