
import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int x,y;
		int counter = 1;
		while(sc.hasNext()) {
			x= sc.nextInt();
			y= sc.nextInt();
			while(x < 0 || 10000 < x);
			while(y < 0 || 10000 < y);
			if(x == 0 && y == 0)
				break;
			if(counter < 3000) {
				if(x <= y)
					System.out.println(x + " " + y);
				if(x > y)
					System.out.println(y + " " + x);
				counter++;
			}
		}
	}


}

