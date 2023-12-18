import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		while(!(x == 0 && y == 0)){
			if(x > y){
				int t = x;
				x = y;
				y = t;
			}
			System.out.println(x + " " + y);
			x = in.nextInt();
			y = in.nextInt();
		}

	}

}