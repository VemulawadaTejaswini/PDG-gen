import java.util.Scanner;

public class Main {
	
	public static void main(String... ac) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), k = sc.nextInt();
		
		int max = Math.max(a, Math.max(b, c));
		
		System.out.println(a + b + c + max * ((1 << k) - 1));
		
	}
	
}