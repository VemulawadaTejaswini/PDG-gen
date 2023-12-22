import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int n = a + (a*a) + (a*a*a);
		System.out.println(n);
	}
}
