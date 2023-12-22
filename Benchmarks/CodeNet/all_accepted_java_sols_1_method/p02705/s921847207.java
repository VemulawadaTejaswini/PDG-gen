import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		double ans = 0;
		
		ans = 2 * Math.PI * r;
		System.out.println(ans);

	}

}