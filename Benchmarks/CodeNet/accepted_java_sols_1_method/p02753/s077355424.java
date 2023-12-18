
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean flag = s.equals("AAA") || s.equals("BBB");
		System.out.println(flag ? "No" : "Yes");
	}
}
