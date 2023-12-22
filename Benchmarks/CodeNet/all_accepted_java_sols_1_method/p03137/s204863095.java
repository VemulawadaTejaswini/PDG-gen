import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  N,M;
		long max=0;
		long sum=0;
		N = sc.nextInt();
		M = sc.nextInt();
		if(N>M) {
			System.out.print("0");
			return;
		}
		long[] X=new long[M];
		for(int i=0;i<M;i++) {
		X[i] = sc.nextInt();
		}
		Arrays.sort(X);
		long[] Dif=new long[M-1];
		for(int i=0;i<M-1;i++) {
          Dif[i]=X[i+1]-X[i];
		}
		Arrays.sort(Dif);
		long ans=0;
		for(int i=0;i<M-N;i++) ans=ans+Dif[i];	
		System.out.println(ans);
			
	}
}
