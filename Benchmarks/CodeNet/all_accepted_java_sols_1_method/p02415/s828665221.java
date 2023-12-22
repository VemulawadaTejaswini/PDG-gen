import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String text = sc.nextLine();
			char[] a = new char[text.length()];
			int[] b = new int[text.length()];
			for (int i = 0; i < text.length(); i++) {
				a[i] = text.charAt(i);
				b[i] = (int) a[i];
				if (b[i] >= 97 && b[i] < 123) {
					b[i] = b[i] - 32;
				} else if (b[i] <= 90 && b[i] > 64) {
					b[i] = b[i] + 32;
				}
				a[i] = (char) b[i];
			}
			System.out.println(a);
		
	}
}
