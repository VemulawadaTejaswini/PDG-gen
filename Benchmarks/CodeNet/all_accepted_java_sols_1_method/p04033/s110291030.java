import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = "";
		if (a < 0 && b < 0) {
			if ((b - a + 1) % 2 == 0) {
				s = "Positive";
			} else {
				s = "Negative";
			}
		} else if (a <= 0 && b >= 0) {
			s = "Zero";
		} else if (a > 0 && b > 0) {
			s = "Positive";
		}
		System.out.println(s);
	}
}
