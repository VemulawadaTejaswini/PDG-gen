import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

		 int n = s.nextInt();
		 int result = 0;

		 for(int i = 0; i < n; i++) {
			 if( i % 2 == 1 && s.nextInt() % 2 == 1) {
				 result++;
			 }
		 }
		 System.out.println(result);
	}
}