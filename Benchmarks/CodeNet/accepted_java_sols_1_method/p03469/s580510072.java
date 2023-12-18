import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		c[3] = '8';
		String ans = new String(c);
		System.out.println(ans);
	}
}
