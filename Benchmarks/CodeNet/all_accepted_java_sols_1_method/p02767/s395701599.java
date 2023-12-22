import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int[] Xs= new int[N];
		for(int i=0;i<N;i++) {
			Xs[i] = sc.nextInt();
		}
		int ans= 1_000_000_000;
		for(int i=1;i<101;i++) {
			int total = 0;
			for(int j=0;j<N;j++) {
				total += (int)Math.pow(Xs[j]-i, 2);
			}
			ans = Integer.min(ans, total);
		}
		System.out.println(ans);
	}

}