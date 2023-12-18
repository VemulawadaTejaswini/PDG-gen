import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(x == 0 && y == 0){
				break;
			}
			if(x > y){
				int t = x;
				x = y;
				y = t;
			}
			System.out.println(x + " " + y);
		}
	}
}