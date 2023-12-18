import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] line = sc.nextLine().split(" ");
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);

		if (B == 1) {
			System.out.println(0);
			return;
		}
		int cnt = 1;
		while (A + (cnt - 1) * (A - 1) < B) {
			cnt++;
		}
		System.out.println(cnt);
	}
}