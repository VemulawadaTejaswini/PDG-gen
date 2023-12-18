import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int a = scan.nextInt();
		int ans = 0;

		while (h > a * ++ans);
		System.out.println(ans);

		scan.close();
	}
}