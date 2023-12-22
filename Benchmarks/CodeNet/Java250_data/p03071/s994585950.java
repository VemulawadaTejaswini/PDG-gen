import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int max = Math.max(A,B);
		int min = Math.min(A, B);
		int ans = Math.max(max + max - 1, max + min );
		System.out.println(ans);
	}
}
