import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int  n=sc.nextInt();
		long a[]=new long[n];
		long s[]=new long[n+1];
		s[0]=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			s[i+1]=s[i]+a[i];
		}
		Arrays.sort(s);
		long c[]=new long[n+1];
		int j=0;
		c[0]=1;
		for(int i=1;i<=n;i++) {
			if(s[i]==s[i-1]) {
				c[j]++;
			}
			else {
				j++;
				c[j]++;
			}
		}
		long ans=0;
		for(int i=0;i<=j;i++) {
			ans+=c[i]*(c[i]-1)/2;
		}
		System.out.println(ans);
	}
}
