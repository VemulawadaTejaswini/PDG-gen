import java.util.Scanner;
public class Main {

	static void swap_print(int x, int y) {
		if(x > y) {
			int t = x;
			x = y;
			y = t;
		}
		System.out.println(x + " " + y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			if(x == 0 && y == 0) break;
			swap_print(x, y);
		}
	}

}