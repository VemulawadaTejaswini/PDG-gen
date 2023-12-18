import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int all = Integer.parseInt(s);
		int n = 0;
		for(char c : s.toCharArray()) {
			n += Integer.parseInt(String.valueOf(c));
		}
		System.out.println(all % n == 0 ? "Yes" : "No");
	}
}