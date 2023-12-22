import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str_s = scan.next();
		int s1 = Integer.parseInt(str_s.charAt(0) + "");
		int s2 = Integer.parseInt(str_s.charAt(1) + "");
		int s3 = Integer.parseInt(str_s.charAt(2) + "");
		int sum = s1 + s2 + s3;
		System.out.println(sum);
	}
}