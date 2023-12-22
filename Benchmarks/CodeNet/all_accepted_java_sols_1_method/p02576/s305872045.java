import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		System.out.println((N+X-1)/X*T);
		
		sc.close();
	}
}
