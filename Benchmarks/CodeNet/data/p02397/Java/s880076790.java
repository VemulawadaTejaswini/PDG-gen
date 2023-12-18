import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x, y,z;
		Scanner sc = new Scanner(System.in);
		while (true) {
			x = sc.nextInt();
			y = sc.nextInt();
			if(x > y){
				z=x;
				x=y;
				y=z;
						
			}
			if (x == 0 && y == 0) break;
			System.out.println(x + "  " + y);
		}
		sc.close();
	}
}
