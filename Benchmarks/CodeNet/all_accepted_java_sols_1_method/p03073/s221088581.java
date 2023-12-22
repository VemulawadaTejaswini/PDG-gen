import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();

		int A = 0;
		int B = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0' ^ i % 2 == 0) {
				A++;
			} else {
				B++;
			}
		}
		System.out.println(Math.min(A, B));

	}
}