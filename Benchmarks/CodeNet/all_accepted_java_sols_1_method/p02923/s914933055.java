import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max = 0;
		for (int i = 0, h, left = scanner.nextInt(), count = 0; i < n - 1; i++) {
			h = scanner.nextInt();
			if (h <= left) {
				count++;
				if (count > max)
					max = count;
			} else
				count = 0;
			left = h;
		}
		System.out.println(max);
	}
}