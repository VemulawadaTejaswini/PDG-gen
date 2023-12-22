import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		for(int i = Math.max(-1000000, X-K+1); i <= Math.min(1000000, X+K-1); i++)
			System.out.print(i + " ");
		System.out.println();

	}

}
