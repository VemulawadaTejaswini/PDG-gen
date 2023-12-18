import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n!=0){
			long a[]=new long[n+5];
			long b[]=new long[n+5];
			Arrays.fill(b,0);
			for(int i=1;i<=n;i++)
				a[i]=in.nextLong();
			for(int i=1;i<=n;i++)
				b[i]=Math.max(b[i-1]+a[i],a[i]);
			long ans=0;
			for(int i=1;i<=n;i++)
				ans=Math.max(ans,b[i]);
			System.out.println(ans);
			n=in.nextInt();
		}
		in.close();
	}
}