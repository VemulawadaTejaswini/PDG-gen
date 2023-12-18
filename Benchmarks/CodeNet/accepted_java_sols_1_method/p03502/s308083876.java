import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n[] = sc.next().split("");
		int x = 0;
		int f = 0;
		for (int i = 0; i < n.length; i++) {
			x = x * 10 + Integer.parseInt(n[i]);
			f += Integer.parseInt(n[i]);
		}
		System.out.println((x % f == 0)? "Yes" : "No");
	}
}