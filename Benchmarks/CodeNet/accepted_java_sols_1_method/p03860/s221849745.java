import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String atCoder = scan.next();
		String s = scan.next();
		String contest = scan.next();
		
		System.out.print(atCoder.charAt(0));
		System.out.print(s.charAt(0));
		System.out.print(contest.charAt(0));
	}

}