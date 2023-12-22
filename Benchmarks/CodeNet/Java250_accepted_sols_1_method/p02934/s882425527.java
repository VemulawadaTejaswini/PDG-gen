import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		double numerator = 1;
		double denominator = 0;
		double ans;
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			numerator *=(double) A[i];
		}
		for(int i=0;i<N;i++) {
			denominator += (double) numerator/A[i];
		}
		ans = numerator/denominator;
		System.out.println(ans);
	}
}
