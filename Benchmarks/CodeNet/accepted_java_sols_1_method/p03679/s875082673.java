import java.util.Scanner;

public class Main {

	public static void main(String... nui) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		
		System.out.println((b <= a) ? "delicious" : (b - a <= x) ? "safe" : "dangerous");
		
	}

}