import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> before = new ArrayList<String>();
		String x;
		int sum = 0;
		while (true) {
			x = sc.next();
			if (x.equals("0")) {
				break;
			}
			before.add(x);
		}
		char[] c;
		for (int i = 0; i < before.size(); i++) {
			c = (before.get(i)).toCharArray();
			for (int j = 0; j < c.length; j++) {
				sum += (c[j] - '0');
			}
			System.out.println(sum);
			sum = 0;
		}
		sc.close();
	}
}
