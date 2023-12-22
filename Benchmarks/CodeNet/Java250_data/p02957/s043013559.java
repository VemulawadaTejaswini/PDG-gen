import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int D = scan.nextInt();
		int sum = N + D;
		if(sum %2 !=0) {
			System.out.println("IMPOSSIBLE");
		}
		else {
			System.out.println(sum/2);
		}
	}

}