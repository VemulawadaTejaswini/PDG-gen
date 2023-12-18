
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		int tmp;
		
		
		while(n++ < 3000) {
			
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if(x > y) {
				tmp = x;
				x = y;
				y = tmp;
			}
			
			if(x == 0 && y == 0) break;
			
			System.out.println(x + " " + y);
			
		}
	}

}
