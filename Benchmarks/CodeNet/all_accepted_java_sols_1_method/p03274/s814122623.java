import java.util.Scanner;

public class Main {
	static int N=(int) 1e5;
	static int n,k;
	static long a[]=new long[N+5];
	static long ans=(long) 2e15;
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		for(int i=1;i<=n;i++) {
			a[i]=sc.nextInt();
		}
		
		int l=0,r=0;
		for(int i=1;i+k-1<=n;i++) {
			l=i;
			r=i+k-1;
			ans=Math.min(ans,a[r]-a[l]+Math.min(Math.abs(a[l]),Math.abs(a[r])));
		}
		
		System.out.println(ans);
	}
}