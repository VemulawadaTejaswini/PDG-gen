import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n!=0){
			int a[]=new int[n+5];
			int b[]=new int[n+5];
			Arrays.fill(b,0);
			for(int i=1;i<=n;i++)
				a[i]=in.nextInt();
			for(int i=1;i<=n;i++)
				b[i]=Math.max(b[i-1]+a[i],a[i]);
			int ans=0;
			for(int i=1;i<=n;i++)
				ans=Math.max(ans,b[i]);
			System.out.println(ans);
			n=in.nextInt();
		}
		in.close();
	}
}