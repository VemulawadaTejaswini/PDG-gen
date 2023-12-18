import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		System.out.println(Math.min(A, B) + " " + Math.max(A+B-N,0));
	}
}
