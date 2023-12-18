import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.nextLine();
		int max = 0;
		while (in.hasNextLine()) {
			int n = 0;
			for (char c : in.nextLine().toCharArray()) {
				if (c == '1') {
					n++;
				}
			}
			max = Math.max(n, max);
		}
		System.out.println(max);
	}
}