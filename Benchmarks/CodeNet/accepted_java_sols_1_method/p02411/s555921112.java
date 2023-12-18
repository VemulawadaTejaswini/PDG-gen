import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			String grade;

			if (m == -1 && f == -1 && r == -1) {
				break;
			} else if (m == -1 || f == -1) {
				grade = "F";
			} else if (m + f < 30) {
				grade = "F";
			} else if (m + f < 50) {
				if (r >= 50) {
					grade = "C";
				} else {
					grade = "D";
				}
			} else if (m + f < 65) {
				grade = "C";
			} else if (m + f < 80) {
				grade = "B";
			} else {
				grade = "A";
			}

			System.out.println(grade);
		}
	}
}

