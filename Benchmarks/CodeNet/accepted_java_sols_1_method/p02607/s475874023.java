import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

		 int n = s.nextInt();
		 int result = 0;

		 for(int i = 1; i <= n; i++) {
			 if(s.nextInt() % 2 == 1 &&  i % 2 == 1) {
				 result++;
			 }
		 }
		 System.out.println(result);
	}
}