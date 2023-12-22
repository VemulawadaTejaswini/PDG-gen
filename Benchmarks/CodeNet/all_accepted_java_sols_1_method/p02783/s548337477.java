import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), a = sc.nextInt();
		System.out.println((h + a - 1) / a);
	}
}
