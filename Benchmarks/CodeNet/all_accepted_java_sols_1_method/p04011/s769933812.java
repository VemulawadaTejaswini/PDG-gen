import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int k = Integer.parseInt(sc.nextLine());
		int x = Integer.parseInt(sc.nextLine());
		int y = Integer.parseInt(sc.nextLine());
		int fee = (n-k) > 0? x * k + y * (n-k) : x * n;
		System.out.println(fee);
	}

}
