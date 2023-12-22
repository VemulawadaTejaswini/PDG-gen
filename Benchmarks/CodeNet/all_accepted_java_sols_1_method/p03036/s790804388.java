import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		long D = sc.nextInt();
		long X = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			X = X * r - D;
			System.out.println(X);
		}	
	}
}