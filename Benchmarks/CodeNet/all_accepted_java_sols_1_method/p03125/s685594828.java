import java.util.*;

public class Main {
	
	static int[] bambooLengths;
	static int N;
	static int A;
	static int B;
	static int C;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (B%A == 0) {
			System.out.println(A+B);
		} else {
			System.out.println(B-A);
		}
		
	}
  
}
