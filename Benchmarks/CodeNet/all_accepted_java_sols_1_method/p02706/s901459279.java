import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		int s = 0;
		for (int i = 0; i < m; i++) s += in.nextInt();
		System.out.println(s>n? -1 : n-s);
	}
}
