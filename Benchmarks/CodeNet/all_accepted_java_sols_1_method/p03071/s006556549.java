import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());


		int count = 0;

		for (int i = 0; i < 2 ; i++) {
			if(a > b) {
				count += a;
				a--;
			} else {
				count += b;
				b--;
			}
		}

		System.out.println(count);
	}
}