import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		int q = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < q; ++i) {
			String o = sc.next();
			int a = sc.nextInt(), b = sc.nextInt();
			switch (o) {
			case "print":
				for (int j = a; j <= b; ++j) {
					System.out.print(sb.charAt(j));
				}
				System.out.println();
				break;
			case "reverse":
				StringBuilder rv = new StringBuilder(sb.substring(a, b + 1));
				rv.reverse();
				sb.replace(a, b + 1, rv.toString());
				break;
			case "replace":
				String p = sc.next();
				sb.replace(a, b + 1, p);
				break;
			}
		}
		sc.close();
	}
}
