import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 int N = scan.nextInt();
		 int L = scan.nextInt();
		 
		 int min_abs_taste = L;
		 int apple_pie_taste = 0;
		 
		 for (int i = 0; i < N; i++ ) {
			 apple_pie_taste += L + i;
			 
			 if (Math.abs(L + i) <= Math.abs(min_abs_taste)) {
				min_abs_taste = L + i; 
			 }
		 }
		
		 System.out.println(apple_pie_taste - min_abs_taste);
		 
		 scan.close();
		 
	}

}
