import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] strings = line.split(" ");

		int[] is = new int[3];
		for (int i = 0; i < strings.length; i++) {
			is[i] = Integer.parseInt(strings[i]);
		}

		for (int i = 0; i < strings.length; i++) {
			int x = is[i];

			while (i > 0 && is[i - 1] > x) {
				is[i] = is[i - 1];
				--i;
			}
			is[i] = x;
		}
		System.out.println(is[0] + " " + is[1] + " " + is[2]);
	}

}