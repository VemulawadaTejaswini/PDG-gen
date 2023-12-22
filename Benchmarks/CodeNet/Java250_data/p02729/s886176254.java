import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int s = 0;
		for (int i = N - 1; i > 0; i--)
			s = s + i;
		for (int i = M - 1; i > 0; i--)
			s = s + i;
		System.out.println("" + s);
	}
}