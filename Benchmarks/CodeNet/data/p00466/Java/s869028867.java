
import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int sum = stdIn.nextInt();
			if(sum == 0) break;
			for(int i = 0; i < 9; i++) {
				sum -= stdIn.nextInt();
			}
			System.out.println(sum);
		
		
		}
	}
}