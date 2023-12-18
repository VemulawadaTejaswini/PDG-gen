
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		while(sc.hasNext()) {
			String s = sc.next();
			if(s.equals("0")) {
				break;
		}
		
		if(x != 0) {
			int y = 0;
			int sum = 0;
			y = x % 10;
			sum = sum + y;
			x = x / 10;

			System.out.printf("%d", sum);
		}
		System.out.println();
	}}
}
