import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0)
				break;
			for (int i = 1; i <= a; i++) {
				for (int c = 1; c <= b; c++) {
				     if ( i == 1 || i == a || c == 1 | c == b ) {
				    	 System.out.printf("#");
				     } else {
				    	 System.out.printf(".");
				     }
				}
				 System.out.println();
			}
		    System.out.println();
		}
     }
}
