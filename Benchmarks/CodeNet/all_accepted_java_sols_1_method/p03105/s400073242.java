import java.util.Scanner;

public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		scan.close();
		int r = B/A;
		if(C<r) {
			System.out.println(C);
		} else {
			System.out.println(r);
			
		}
	}

}