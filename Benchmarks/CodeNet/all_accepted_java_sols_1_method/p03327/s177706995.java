
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n<=999) {
			System.out.println("ABC");
		}
		else if(n>=1000) {
			System.out.println("ABD");
		}

	}

}