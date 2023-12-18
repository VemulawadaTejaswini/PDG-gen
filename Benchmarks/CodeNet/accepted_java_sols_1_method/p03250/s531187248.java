import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		a[0] = in.nextInt();
		a[1] = in.nextInt();
		a[2] = in.nextInt();
		Arrays.sort(a);
		System.out.println(a[2] * 10 + a[1] + a[0]);
	}
}