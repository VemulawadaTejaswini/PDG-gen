import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] st = s.split(" ");
		int[] ints = new int[3];
		for (int i = 0; i < 3; i++) {
			ints[i] = Integer.parseInt(st[i]);
		}
		if (ints[0] < ints[1] && ints[1] < ints[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}

	}

}