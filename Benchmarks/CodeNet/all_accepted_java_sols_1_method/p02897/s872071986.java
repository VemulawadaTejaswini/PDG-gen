import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.printf("%.20f",(double)((n/2)+(n%2))/n);
		scan.close();
	}
}
