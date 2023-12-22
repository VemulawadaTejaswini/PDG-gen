
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		int sum = 0;
		for(int i = 0; i < M; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < M; j++) {
				if(a[j] == i) {
					sum++;
				}
				if(b[j] == i) {
					sum++;
				}
			}
			System.out.println(sum);
			sum = 0;
		}
		scan.close();

	}

}
