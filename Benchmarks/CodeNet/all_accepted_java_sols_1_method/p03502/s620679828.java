import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] ary = String.valueOf(n).toCharArray();
		int h = 0;
		for (char c : ary) {
			h += Character.getNumericValue(c);
		}
		System.out.println(n%h == 0 ? "Yes":"No");
	}
}
