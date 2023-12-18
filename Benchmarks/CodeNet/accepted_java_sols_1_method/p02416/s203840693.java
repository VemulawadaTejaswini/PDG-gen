import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		while (true) {
			String ins = scan.nextLine();
			if (ins.equals("0"))
				break;
			int ans = 0;
			for (int i = 0; i < ins.length(); i++)
				ans += (int) (ins.charAt(i) - '0');
			System.out.println(ans);
		}

		System.exit(0);
	}

}