import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			char ol[]=new char[n];
			char ne[]=new char[n];
			for(int i=0;i<n;i++){
				ol[i]=(sc.next()).charAt(0);
				ne[i]=(sc.next()).charAt(0);
			}
			long m=sc.nextInt();
			String ans=null;
			for(int i=0;i<m;i++){
				ans+=sc.next();
			}
			for(int i=0;i<n;i++){
				ans.replace(ol[i],ne[i]);
			}
			System.out.println(ans);
		}
	}
}