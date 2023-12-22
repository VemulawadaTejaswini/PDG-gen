import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tap = Integer.parseInt(sc.next());
		int socketGoal = Integer.parseInt(sc.next());

		int socket = 1;

		for (int i = 0;; i++) {
			if (socket >= socketGoal) {
				System.out.println(i);
				break;
			}
			socket += tap - 1;
		}

	}

}
