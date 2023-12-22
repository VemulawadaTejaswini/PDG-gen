import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] string = line.split(" ");
		int[] is = new int[string.length];
		for (int i = 0; i < is.length; i++) {
			is[i] = Integer.parseInt(string[i]);
		}

		int W = is[0];
		int H = is[1];
		int x = is[2];
		int y = is[3];
		int r = is[4];

		if ((r <= x && x <= (W - r)) && (r <= y && y <= (H - r))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}