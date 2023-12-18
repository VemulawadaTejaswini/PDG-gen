import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		
		int r = (n/x + (n%x > 0 ? 1 : 0))*t; 

		System.out.println(r);
	}
}
