import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int a=scanner.nextInt();
		int b=scanner.nextInt();
//		System.out.println("a=" + a);
//		System.out.println("b=" + b);

		if(Math.abs(a-b)%2 == 1) System.out.println("IMPOSSIBLE");
		else {
			int sol=Math.abs(a-b) /2;
			System.out.println(Math.max(a, b) - sol);
		}

		scanner.close();
	}
}
