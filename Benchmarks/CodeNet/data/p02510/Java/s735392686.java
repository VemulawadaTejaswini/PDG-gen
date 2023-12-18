import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			if (str == "-")
				break;
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				String substr1 = str.substring(0, m);
				String substr2 = str.substring(m, str.length());
				str = substr2 + substr1;
			}
			System.out.println(str);
			str = sc.nextLine();
		}
	}
}