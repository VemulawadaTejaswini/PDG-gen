import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int h1 = stdIn.nextInt();
		int m1 = stdIn.nextInt();
		
		int h2 = stdIn.nextInt();
		int m2 = stdIn.nextInt();
		
		int k = stdIn.nextInt();
		
		
		int a = 60*h1+m1;
		int b = 60*h2+m2;
		
		System.out.println(b-a-k);
		
		
		
		
	}

}
