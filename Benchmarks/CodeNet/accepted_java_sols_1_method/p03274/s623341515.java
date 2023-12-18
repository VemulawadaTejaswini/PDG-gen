
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

//		System.setIn(new FileInputStream("tc/1.txt"));
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		int start = 0;
		int end = K - 1;
		while (end < N) {
			int doubleDis = Integer.min(Math.abs(C[start]), Math.abs(C[end]));
			min = Integer.min(min, C[end] - C[start] + doubleDis);
			start++;
			end = start + K - 1;
		}
		System.out.println(min);
		sc.close();
	}
}