
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int a = scan.nextInt();
		int lst[] = new int[a];
		
		for(int i = 0; i < a; i++) {
			lst[i] = scan.nextInt();
		}
		
		int minimum = lst[0];
		int maximum = lst[1]-lst[0];
		
		for(int i = 1; i < a; i++) {
			maximum = Math.max(maximum, lst[i] - minimum);
			minimum = Math.min(minimum, lst[i]);

		}
		System.out.println(maximum);
		
	}

}

