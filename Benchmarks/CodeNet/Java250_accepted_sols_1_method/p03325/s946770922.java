
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int[] ai = new int[N];

		for(int i = 0;i<N;i++) {
			ai[i] = scanner.nextInt();
		}

		int cnt = 0;
		for (int i : ai) {
			while(i%2 != 1) {
				cnt ++;
				i = i/2;
			}
		}

		System.out.println(cnt);

	}

}
