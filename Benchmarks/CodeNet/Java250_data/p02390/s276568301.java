
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();

		int h = i / 3600;
		i = i - h * 3600;



		int m = i / 60;

		int s = i - m * 60;

		System.out.println(h + ":" + m + ":" + s);

		scan.close();


	}

}