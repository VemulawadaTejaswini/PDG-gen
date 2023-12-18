import java.util.Scanner;
public class Main {

	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		while(in.hasNextInt()) {
			int i = in.nextInt();
			
			if((i % 2 == 0 || i % 3 == 0) && i != 2 && i != 3) {
				count++;
			}
			
			else {
			
				for(int j = 1; (6 * j) - 1 <= (int) Math.sqrt(i * 1.0); j++) {
					if((i == (6 * j) - 1) || (i == (6 * j) + 1)) {
						count++;
				}
			
		
			}
		}
		}
		
		System.out.println(count);
	}
}
