import java.util.Scanner;

public class Main {

	private static int x;
	private static int y;

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int temp = 0;
		
		for(int i =0; i > 3000; i++) {
			int x = stdin.nextInt();
			int y = stdin.nextInt();
			if(x != 0 || y !=0) {
				if(x > y) {
					temp = x;
					x = y;
					y = temp;
				}
			}
			
			System.out.println(x + " " + y);
			} while (x == 0 && y == 0) {
			break;
	
		}
			stdin.close();
	}

}