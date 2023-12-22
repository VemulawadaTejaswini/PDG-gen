import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		int[] W=new int[N+1];
		W[0]=0;

		for(int i=0;i<N;i++)  W[i+1]=sc.nextInt()+W[i];

		int ans=1000000;

		for(int i=1;i<N;i++) {
			int S1=W[i];
			int S2=W[N]-W[i];
			ans=Math.min(Math.abs(S1-S2), ans);
		}

		System.out.println(ans);

		sc.close();
	}

}
