import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int start = Math.max(A, C);
		int end = Math.min(B, D);
		
		System.out.println(Math.max(0, end - start));
	}
}
