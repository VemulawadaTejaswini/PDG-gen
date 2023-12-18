import java.util.Scanner;
public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int[] n = new int[6];

		for (int i = 0; i < 6; i++) {
			n[i] = sc.nextInt();
		}
		if ((n[4] - n[0]) <= n[5]) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}

	}
}