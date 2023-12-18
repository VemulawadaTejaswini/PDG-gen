import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			if ((r | c) == 0)
				break;
			System.out.println(r * c % 2 == 0 ? "yes" : "no");
		}
	}
}