import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		A = (A+11)%13;
		B = (B+11)%13;
		System.out.println(A==B ? "Draw" : (A>B ? "Alice" : "Bob"));
		
		sc.close();
	}
}
