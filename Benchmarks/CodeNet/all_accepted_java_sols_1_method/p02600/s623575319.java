import java.util.Scanner;

// m_solutions2020_a
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();

		int rating = 0;
		if (400 <= X && X <= 599) {
			rating = 8;
		} else if (600 <= X && X <= 799) {
			rating = 7;
		} else if (800 <= X && X <= 999) {
			rating = 6;
		} else if (1000 <= X && X <= 1199) {
			rating = 5;
		} else if (1200 <= X && X <= 1399) {
			rating = 4;
		} else if (1400 <= X && X <= 1599) {
			rating = 3;
		} else if (1600 <= X && X <= 1799) {
			rating = 2;
		} else if (1800 <= X && X <= 1999) {
			rating = 1;
		}

		System.out.println(rating);
		sc.close();
	}
}
