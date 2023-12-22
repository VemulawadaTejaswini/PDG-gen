import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		sc.close();

		if(X - t >= 0) {
			System.out.println(X - t);
		}else {
			System.out.println(0);
		}

	}
}
