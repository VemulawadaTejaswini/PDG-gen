import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = Integer.parseInt(sc.next());
		double edge = L / 3.0;
		double ans = edge * edge * edge;
		System.out.printf("%.12f\n", ans);
	}

}
