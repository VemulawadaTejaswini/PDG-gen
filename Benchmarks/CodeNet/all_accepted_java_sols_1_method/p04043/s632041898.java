import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] len = new int[3];

		for(int i = 0; i < 3; i++) {

			len[i] = sc.nextInt();
		}

		Arrays.sort(len);

		System.out.println((len[0] == 5 && len[1] == 5 && len[2] == 7) ? "YES" : "NO");
	}
}