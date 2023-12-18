import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int e = K / 2;
		int o = K - e;
		System.out.println(e*o);

	}
}