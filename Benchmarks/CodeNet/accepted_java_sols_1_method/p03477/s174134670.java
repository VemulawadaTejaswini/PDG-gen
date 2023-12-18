import java.util.Scanner;

public class Main {

	public static void main(String... nui) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		
		System.out.println((a + b < c + d) ? "Right" : (a + b > c + d) ? "Left" : "Balanced");
	}

}
