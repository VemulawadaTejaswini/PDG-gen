import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double T = (double) Integer.parseInt(sc.next());
		double X = (double) Integer.parseInt(sc.next());
		sc.close();

		double ans = T / X;
		System.out.println(ans);

	}

}