import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int k = scan.nextInt();
			if (k % 2 == 1) {
				int odd = (k/2)+1;
				int e = k/2;
				System.out.println(odd*e);
				return;
			} else {
				int o = k/2;
				int e = k/2;
				System.out.println(o*e);
				return;
			}
	}
}
