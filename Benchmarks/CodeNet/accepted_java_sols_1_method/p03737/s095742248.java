import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next().toUpperCase();
		String b = sc.next().toUpperCase();
		String c = sc.next().toUpperCase();

		String ans = "";

		ans += a.substring(0,1);
		ans += b.substring(0,1);
		ans += c.substring(0,1);
		System.out.println(ans);
	}
}