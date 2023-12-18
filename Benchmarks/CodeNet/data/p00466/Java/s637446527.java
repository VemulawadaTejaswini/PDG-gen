
import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int sum = stdIn.nextInt();
		for(int i = 0; i < 9; i++) {
			sum -= stdIn.nextInt();
		}
		System.out.println(sum);
		
		
		
	}
}