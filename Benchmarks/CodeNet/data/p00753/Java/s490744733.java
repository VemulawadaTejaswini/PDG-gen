import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		boolean[] E=new boolean[123456];
		for(int a=2;a<123456;a++) E[a]=true;
		for(int a=2;a<1000;a++) if(E[a]) for(int b=a*a;b<123456;b+=a) E[b]=false;

		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			int ans=0;
			for(int a=n+1;a<=2*n;i++) if(E[a]) ans++;
			System.out.println(ans);
		}

		return;
	}
}