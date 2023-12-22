import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		
		System.out.println(Math.max(A+B,Math.max(A-B,A*B)));

	}

}