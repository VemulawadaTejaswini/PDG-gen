
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int a[]=new int[N+2];
		int sum=0;
		a[0] = 0;
		for(int i=1;i<=N;i++) {
			a[i] = in.nextInt();
			sum=sum+Math.abs(a[i-1]-a[i]);
		}
		a[N+1]=0;
		sum=sum+Math.abs(a[N]-a[N+1]);
		int tmp1=0;
		int tmp2=0;
		for(int i=1;i<=N;i++) {
			tmp1=Math.abs(a[i-1]-a[i])+Math.abs(a[i]-a[i+1]);
			tmp2=Math.abs(a[i-1]-a[i+1]);
			System.out.println(sum-tmp1+tmp2);
		}

	}
}
