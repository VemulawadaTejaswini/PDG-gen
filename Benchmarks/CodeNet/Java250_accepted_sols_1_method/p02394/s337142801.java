import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();

		if(x < 0 && x + r <= 0 || x + r > X){
			System.out.println("No");
		}
		else if(y < 0 && y + r <= 0 || y + r > Y){
				System.out.println("No");
		}
		else if(x + r < 0 || x + r > X || y + r < 0 || y + r > Y){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}
}