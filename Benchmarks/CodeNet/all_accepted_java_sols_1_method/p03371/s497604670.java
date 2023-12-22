import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min = a * x + b * y;
		if (x > y) {
			int total = c * 2 * y + (x - y) * a;
			if (total < min) { 
				min = total;
			}
			total = c * 2 * x;
			if (total < min) { 
				min = total;
			}
		} else {
			int total = c * 2 * x + (y - x) * b;
			if (total < min) { 
				min = total;
			}
			total = c * 2 * y;
			if (total < min) { 
				min = total;
			}
		}
		System.out.println(min);
	}
}
