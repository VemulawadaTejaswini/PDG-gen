import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String reverse = sc.nextLine();
			char[] a = reverse.toCharArray();
			char[] b = new char[a.length];
			int j = 0;
			for (int i = a.length - 1; i >= 0; i--) {
				b[j] = a[i];
				j++;
			}
			System.out.println(b);
		}
	}
}