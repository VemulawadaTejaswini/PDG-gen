import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt() - 1;
			String s = sc.next();

			char[] cs = s.toCharArray();
			cs[k] = Character.toLowerCase(cs[k]);
			System.out.println(new String(cs));
		}
	}
}
