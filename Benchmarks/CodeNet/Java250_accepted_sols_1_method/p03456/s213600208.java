import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int ab = Integer.parseInt(s.replaceAll(" ", ""));
		int sqrt = (int)Math.sqrt(ab);
		System.out.println((sqrt * sqrt == ab) ?"Yes" : "No");
	}
}
