import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int b = sc.nextInt();
			int p = sc.nextInt();
			int cost = x * b + y * p;
			int discount = x * Math.max(5, b) + y * Math.max(2, p);
			discount = discount * 4 / 5;
			System.out.println(Math.min(cost,discount));
		}
	}

}