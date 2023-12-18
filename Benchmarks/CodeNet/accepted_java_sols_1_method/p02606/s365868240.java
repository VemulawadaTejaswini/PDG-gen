import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

		 int l = s.nextInt();
		 int r = s.nextInt();
		 int d = s.nextInt();

		 int result = 0;

		 for(int i = l; i <= r; i++) {
			 if(i % d == 0) {
				 result++;
			 }
		 }

		 System.out.println(result);
	}

}