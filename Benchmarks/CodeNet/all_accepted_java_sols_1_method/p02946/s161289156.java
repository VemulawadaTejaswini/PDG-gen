import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int K = stdIn.nextInt();
		int X = stdIn.nextInt();
		
		for(int i = Math.max(X-K+1, -1000000); i < Math.min(X+K-1, 1000000); i++) {
			System.out.print(i+ " ");
		}
		System.out.println(Math.min(X+K-1, 1000000));

	}

}