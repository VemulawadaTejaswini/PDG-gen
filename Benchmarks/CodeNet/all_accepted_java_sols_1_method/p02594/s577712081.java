import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
//		String s = sc.next();

		//input
		if(30<=n) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
