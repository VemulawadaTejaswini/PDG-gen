import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] Q = new int[N];
		int anser = 0;
		for(int i = 0; i<N ; i++) {
			Q[i] = sc.nextInt();
		}
		Arrays.sort(Q);
		System.out.println(Q[N/2]-Q[N/2-1]);

	}
}