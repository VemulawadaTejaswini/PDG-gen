import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double k;
		int n = sc.nextInt();
		k = Math.sqrt(n);
		int ans = (int) k;
		System.out.println(ans * ans);
	}
}