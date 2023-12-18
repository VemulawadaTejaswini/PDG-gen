import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final long N = sc.nextInt();
		final long M = sc.nextInt();
		
		//1*1か
		if(N == 1 && M == 1) {
			System.out.println(1);
		} else {
			//1列or1行か
			if(N == 1 || M == 1) {
				System.out.println(Math.max(N - 2, M - 2));
			} else {
				System.out.println((N - 2) * (M - 2));
			}
		}
	}
}
