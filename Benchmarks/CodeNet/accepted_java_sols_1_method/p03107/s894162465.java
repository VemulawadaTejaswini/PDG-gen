import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String tmp1 = s;
		String tmp2 = s;
		int red = tmp1.replace("1", "").length();
		int blue = tmp2.replace("0", "").length();
		System.out.println(Math.min(red, blue) * 2);
	}
}