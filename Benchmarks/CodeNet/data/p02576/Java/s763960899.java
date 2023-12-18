import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] tmp = sc.nextLine().split(" ");
		int n = Integer.parseInt(tmp[0]);
		double x = Integer.parseInt(tmp[1]);
		int t = Integer.parseInt(tmp[2]);

		n = (int)(Math.ceil(n / x)) * t;
		System.out.println(n);

	}

}
