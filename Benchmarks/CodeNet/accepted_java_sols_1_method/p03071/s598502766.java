
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

		scan.close();
		
		int r = 0;
		if(A<B) {
			r=B;
			if(A<B-1) {
				r=r+B-1;
			} else {
				r=r+A;
			}
		} else {
			r=A;
			if(B<A-1) {
				r=r+A-1;
			} else {
				r=r+B;
			}
		}
		System.out.println(r);

	}

}
