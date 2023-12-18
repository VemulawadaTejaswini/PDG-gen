import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

		 int a = s.nextInt();

		 int result = 1000 - a % 1000;

		 if(result == 1000) {
			 result = 0;
		 }

		 System.out.println(result);
	}

}