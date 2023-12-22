import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long start = 100;
		long goal = Long.parseLong(sc.next());
		int year = 0;
		while (true) {
			start *= 1.01;
			year++;
			if (start >= goal) {
				System.out.println(year);
				break;
			}

		}

	}

}
