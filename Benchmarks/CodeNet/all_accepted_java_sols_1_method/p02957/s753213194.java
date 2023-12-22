import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
				
		if(a%2 != b%2) {
			System.out.println("IMPOSSIBLE");
		}else {
			System.out.println((a+b)/2);
		}
		
		
	}

}
