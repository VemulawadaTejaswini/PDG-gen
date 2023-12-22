import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String W = scan.nextLine().toLowerCase();
		int ans = 0;
		while (scan.hasNext()) {
			String t = scan.next();
			if (t.equals("END_OF_TEXT"))
				break;
			t=t.toLowerCase();
			if (t.equals(W))
				ans++;
		}
		System.out.println(ans);
		System.exit(0);
	}

}