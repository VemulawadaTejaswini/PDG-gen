import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();

		scan.close();
		double ans = Math.pow((double)l/3,3);
		System.out.println(ans);
	}
}
