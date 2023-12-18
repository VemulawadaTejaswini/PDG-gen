import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); in.nextLine();
		int[] ary = new int[n];
		for ( int i = 0; i < n; i++ ) {
			ary[i] = in.nextInt();
		}
		Arrays.sort(ary);
		int d = 0;
		for ( int i = 1; i < n; i++ ) {
			d += ary[i]-ary[i-1];
		}
		System.out.println(d);
	}
}