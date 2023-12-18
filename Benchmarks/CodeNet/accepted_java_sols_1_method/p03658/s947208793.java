import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] l = new int[N];
		for(int i = 0; i < N; i++) {
			l[i] = scan.nextInt();
		}
		Arrays.sort(l);
		for(int i = 0; i < K; i++) {
			sum += l[N - 1 - i];
		}
		System.out.println(sum);
		scan.close();

	}

}
