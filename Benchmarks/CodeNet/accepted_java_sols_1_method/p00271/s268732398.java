import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[] = new int[14];
		int b[] = new int[7];
		for (int i = 0; i < 14; i++) {
			a[i] = stdIn.nextInt();
		}
		for (int i = 0, j = 0; i < 7; i++) {
			b[i] = a[j] - a[j + 1];
			j = j + 2;
		}
		for (int i = 0; i < 7; i++) {
			System.out.println(b[i]);
		}
	}
}