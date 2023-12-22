
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		if(A%2!=B%2) {
			System.out.println("IMPOSSIBLE");
		}
		else {
			System.out.println((A+B)/2);
		}

	}

}