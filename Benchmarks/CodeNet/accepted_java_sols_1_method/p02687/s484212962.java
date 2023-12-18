import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String contest = sc.next();
		if (contest.equals("ABC")) {
			System.out.println("ARC");
		} else 	if (contest.equals("ARC")) {
			System.out.println("ABC");
		}
	}		
}