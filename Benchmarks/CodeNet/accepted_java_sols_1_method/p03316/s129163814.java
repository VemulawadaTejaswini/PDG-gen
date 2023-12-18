import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String n = sc.next();
		int s = 0;
		for (int i = 0; i < n.length(); i++) {
			s += n.charAt(i) - '0';
		}
		if (Integer.parseInt(n) % s == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
