import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner stdin = new Scanner(System.in);

		while(true) {

			int student = stdin.nextInt();

            if(student == 0) {
            	break;
            }

			int m = stdin.nextInt();
			int e = stdin.nextInt();
			int j = stdin.nextInt();
			int averageTwo = (m + e) / 2;
			int average = (m + e + j) / 3;

			if(m == 100 || e == 100 || j == 100){
				System.out.println("A");
			} else if( averageTwo >= 90) {
				System.out.println("A");
			} else if(average >= 80) {
				System.out.println("A");
			} else if(80 >= average && 70 <= average  ) {
				System.out.println("B");
			} else if( average >= 50 && m >= 80) {
				System.out.println("B");
			} else if(average >= 50 && e >= 80) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		}

	}

}