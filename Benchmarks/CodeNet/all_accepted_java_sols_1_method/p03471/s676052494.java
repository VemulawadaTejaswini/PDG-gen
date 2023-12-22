import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());

		boolean isSolved = false;
		outer: for (int x = 0; x <= N; x++) {
			for (int y = 0; y <= N; y++) {
				int z = N - x - y;
				if (z < 0)
					break;
				else if (isSolved = (x * 10000 + y * 5000 + z * 1000 == Y)) {
					System.out.println(x + " " + y + " " + z);
					break outer;
				}
			}
		}

		if(!isSolved) {
			System.out.println("-1 -1 -1");
		}
		sc.close();

	}

}
