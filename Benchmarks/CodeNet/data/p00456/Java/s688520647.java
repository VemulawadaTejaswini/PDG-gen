import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int[] w = new int[10];
		int[] k = new int[10];
		for (int i = 0; i < 10; i++){
			w[i] = scanner.nextInt();
		}
		for (int i = 0; i < 10; i++){
			k[i] = scanner.nextInt();
		}
		Arrays.sort(w);
		Arrays.sort(k);
		int sumW = w[7] + w[8] + w[9];
		int sumK = k[7] + k[8] + k[9];
		System.out.println(sumW + " " + sumK);
	}

}

