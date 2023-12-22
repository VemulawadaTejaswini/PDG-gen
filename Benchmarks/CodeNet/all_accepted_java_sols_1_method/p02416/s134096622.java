import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		int temp = 0;
		while (true) {
			if (x.equals("0")) {
				break;
			}
			for (int i = 0; i < x.length(); i++) {
				temp += Integer.parseInt(x.substring(i, i + 1));
			}
			System.out.println(temp);
			temp = 0;
			x = sc.nextLine();
		}
	}
}
