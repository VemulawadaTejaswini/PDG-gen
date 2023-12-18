import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("");
		String[] t = sc.nextLine().split("");
		sc.close();
		int size = s.length;
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (!s[i].equals(t[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
