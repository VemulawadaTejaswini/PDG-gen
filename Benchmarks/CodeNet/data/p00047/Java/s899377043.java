import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String ball = "A";
			while (sc.hasNext()) {
				String[] cup = sc.next().split(",");

				if (ball.equals(cup[0])) {
					ball = cup[1];
				} else if (cup.equals(cup[1])) {
					ball = cup[0];
				}
			}
			System.out.println(ball);

		} finally {
			sc.close();
		}
	}
}