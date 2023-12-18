import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		String contest;
		if (R < 1200) {
			contest = "ABC";
		} else if (R < 2800) {
			contest = "ARC";
		} else {
			contest = "AGC";
		}
		System.out.println(contest);
	}
}