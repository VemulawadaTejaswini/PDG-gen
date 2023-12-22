import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		do {
			C -= B;
			if(C <= 0) {
				System.out.println("Yes");
				break;
			}
			A -= D;
			if(A <= 0) {
				System.out.println("No");
				break;
			}
		} while(A > 0 || C > 0);
		
	}
	
}