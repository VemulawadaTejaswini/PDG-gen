import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main();
	}

	Main() {
		Scanner sc = new Scanner(System.in);
		int[] in = new int[10];
		for (int i = 0; i < 10; i++) {
			in[i] = sc.nextInt();
		}
		Arrays.sort(in);
		for (int i = 0; i < 3; i++)
			System.out.println(in[9-i]);
	}
}