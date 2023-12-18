import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//スキャナー
		Scanner s = new Scanner(System.in);

		int numx = s.nextInt();
		int numy = s.nextInt();
		
		s.close();
		
		//true=Yes
		boolean ans = true;
		
		if(numy % 2 == 1) {
			ans = false;
		}
		if(numy < numx * 2 || numy > numx * 4 ) {
			ans = false;
		}
		
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
