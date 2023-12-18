import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long y = sc.nextLong();
		int length = 0;

		while (true){

			if (x > y){
				break;
			} else {
				length +=1;
			}
			x = x*2;
		}
		System.out.println(length);
	}
}
