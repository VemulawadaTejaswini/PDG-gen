import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		int c;
		int d = a/2;
		int Answer = 0;
		for(int i = 0; a>i; i++) {
			c = sc.nextInt();
			b[i] = c;
		}
		Arrays.sort(b);
		int f = b[d];
		int g = b[d-1];
		Answer = f-g;
		System.out.println(Answer);
	}
}