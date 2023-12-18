import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String ins = scan.next();
			int n = scan.nextInt();

			for (int rep = 0; rep < n; rep++) {
				String op = scan.next();
				int a = scan.nextInt();
				int b = scan.nextInt();
				if (op.equals("print")) {
					System.out.println(ins.substring(a, b + 1));
				} else if (op.equals("replace")) {
					String r = scan.next();
					String ans = "";
					if (a > 0)
						ans = ans.concat(ins.substring(0, a));
					ans = ans.concat(r);
					if (b + 1 < ins.length())
						ans = ans.concat(ins.substring(b + 1, ins.length()));
					ins = ans.substring(0, ans.length());
				} else if (op.equals("reverse")) {
					String ans = "";
					if (a > 0)
						ans = ans.concat(ins.substring(0, a));
					for (int i = b; i >= a; i--)
						ans = ans.concat(ins.substring(i, i + 1));
					if (b + 1 < ins.length())
						ans = ans.concat(ins.substring(b + 1, ins.length()));
					ins = ans.substring(0, ans.length());

				}
			}
			break;
		}
		scan.close();
		System.exit(0);
	}

}