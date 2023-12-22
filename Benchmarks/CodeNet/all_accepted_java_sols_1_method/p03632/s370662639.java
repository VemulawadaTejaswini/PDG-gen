import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aliceStart = sc.nextInt();
		int aliceEnd = sc.nextInt();
		int bobStart = sc.nextInt();
		int bobEnd = sc.nextInt();
		int time = 0;

		if (aliceStart >= bobStart) {
			if (aliceEnd >= bobEnd) {
				time = bobEnd - aliceStart > 0 ? bobEnd - aliceStart : 0;
			} else {
				time = aliceEnd - aliceStart;
			}
		} else {
			if (bobEnd >= aliceEnd) {
				time = aliceEnd - bobStart > 0 ? aliceEnd - bobStart : 0;
			} else {
				time = bobEnd - bobStart;
			}
		}

		System.out.println(time);

	}

}
