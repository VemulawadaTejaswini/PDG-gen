import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int x = stdIn.nextInt();
		int t = stdIn.nextInt();
		
		System.out.println((n+x-1)/x*t);
		
		

	}

}
