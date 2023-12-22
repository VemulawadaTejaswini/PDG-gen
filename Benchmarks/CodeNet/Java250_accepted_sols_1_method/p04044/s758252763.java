import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		String[] strArray = new String[N];

		for (int i = 0; i < N; i++) {
			strArray[i] = sc.next();
		}

		Arrays.sort(strArray);
		System.out.println(String.join("", strArray));
	}
}
