
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		for(int i=0;i<=n-1;i++) {
			a[i]=sc.nextLong();
		}
		
		long[] r=new long[(n*n-n)/2-1];
		for(int i=0;i<=n-2;i++) {
		for(int j=i+1;j<=n-1;j++) {
			 r[i*n+j-1]=a[i]*a[j];
		}}
		int sum=0;
		for(int i=0;i<=r.length-1;i++) {
		
				sum+=r[i];
		}
		sum%=1000000007;
		System.out.println(sum);
		sc.close();
	}
}