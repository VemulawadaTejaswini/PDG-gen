import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		boolean opened = false;

		String ids = " ";// IDを空白区切りで登録
		for (int i = 0; i < N; i++) {
			String id = scanner.next();
			ids += id + " ";
		}
		int M = scanner.nextInt();
		for (int i = 0; i < M; i++) {
			String user = scanner.next();
			if (ids.indexOf(" " + user + " ") != -1) {
				if (opened) {
					opened = false;
					System.out.print("Closed by");
				} else {
					opened = true;
					System.out.print("Opened by");
				}
			} else {
				System.out.print("Unknown");
			}
			System.out.print(" " + user);
			System.out.print("\n");
		}

	}

}