import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int r = stdIn.nextInt();
		int D = stdIn.nextInt();
		int x = stdIn.nextInt();
		
		for(int i = 0; i < 10; i++) {
			x = r*x - D;
			System.out.println(x);
		}

	}

}