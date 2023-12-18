import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float f = sc.nextFloat();
		int ans = (int) (n * f);
		System.out.println(ans);
	}
}
