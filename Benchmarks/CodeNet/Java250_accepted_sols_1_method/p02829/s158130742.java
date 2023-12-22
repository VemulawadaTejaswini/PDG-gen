import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
		
		if ((A == 1 && B == 2) || (B == 1 && A == 2) ) {
			
			System.out.print(3);
		}
		
		if ((A == 2 && B == 3) || (B == 2 && A == 3) ) {
			
			System.out.print(1);
		}

		if ((A == 1 && B == 3) || (B == 1 && A == 3) ) {
			
			System.out.print(2);
		}
		
	}

}