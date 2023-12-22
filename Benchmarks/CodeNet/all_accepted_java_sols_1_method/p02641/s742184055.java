import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int length = scanner.nextInt();
		ArrayList<Integer> unwanted = new ArrayList<Integer>();
		for(int i = 0; i < length; i++) {
			unwanted.add(scanner.nextInt());
		}
		int maximum = -100;
		int difference = 0;
		while(maximum == -100) {
			if(!unwanted.contains(x - difference))
				maximum = x - difference;
			else if(!unwanted.contains(x + difference))
				maximum = x + difference;
			difference++;
		}
		System.out.print(maximum);
		
	}
}