import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int x;
		int y;
		int temp;
		
		Scanner stdin = new Scanner(System.in);
		
		x = stdin.nextInt();
		y = stdin.nextInt();
		
		while(true) {
			if (x == 0 && y == 0) {
			break;	
			}	
			temp = x;
			x = y;
			y = temp;
		}
		System.out.println(x + " " + y);
		 	
		stdin.close();
	}
	
}