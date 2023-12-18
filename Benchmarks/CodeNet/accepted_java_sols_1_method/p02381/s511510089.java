import java.util.Scanner;

public class Main {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n=sc.nextInt();
			if(n==0)break;
			int A[]=new int[n];
			double sum=0;
			for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
			sum+=A[i];
			}
			sum/=n;
			double ans=0;
			for(int i=0;i<n;i++) {
				ans+=Math.pow(A[i]-sum, 2);
			}
			ans/=n;
			System.out.println(Math.sqrt(ans));
		}
	}
}
