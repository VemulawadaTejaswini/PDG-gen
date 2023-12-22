import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = 0;
		if(A >12 ) {
			C = B;
		}else {
			if(A > 5) {
				C = B/2;
			}else {

			}
		}
		System.out.println(C);
	}

}
