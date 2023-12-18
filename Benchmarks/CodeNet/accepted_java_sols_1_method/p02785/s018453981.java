import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),K=sc.nextInt();
		Long[] h=new Long[N];

		for(int i=0;i<N;i++) {
			h[i]=sc.nextLong();
		}
		Arrays.sort(h);

		long ans=0;

		for(int i=0;i<N-K;i++) {
			ans+=h[i];
		}
		System.out.println(ans);
	}
}
