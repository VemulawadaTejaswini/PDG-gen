import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		for (int i=0; i<N; i++) {
			x[i] = sc.nextInt();
		}
		int res = 0;
		for (int i=0; i<N; i++) {
			res += Math.min(Math.abs(0-x[i]), Math.abs(K-x[i]));
		}		
		System.out.println(res*2);
	}
}
