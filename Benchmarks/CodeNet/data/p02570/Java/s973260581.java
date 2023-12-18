import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int t = scan.nextInt();
		int s = scan.nextInt();
		
		String message = "NO";
		
		if(d <= t*s) {
			message = "YES";
		}
		
		System.out.println(message);

	}

}