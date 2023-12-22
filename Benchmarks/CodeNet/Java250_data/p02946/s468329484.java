import java.util.*;

public class Main {
	static final int edge = 1000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), x = sc.nextInt();
		sc.close();
		k--;
		int s = x - k;
		if (s < -edge)
			s = -edge;
		int end = x + k;
		if (end > edge)
			end = edge;
		for (int i = s; i <= end; ++i)
			System.out.print(i + " ");
		System.out.println();
	}
}
