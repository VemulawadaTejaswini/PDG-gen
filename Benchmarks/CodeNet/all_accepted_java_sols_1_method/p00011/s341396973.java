import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int w = sc.nextInt();
		int[] ints = new int[w];
		for (int i=0; i<w; i++) {
			ints[i] = i+1;
		}
		int n = sc.nextInt();
		String[] strs = new String[2];
		for (int i=0; i<n; i++) {
			strs = sc.next().split(",");
			int L = Integer.parseInt(strs[0]) - 1;
			int R = Integer.parseInt(strs[1]) - 1;
			int temp = ints[L];
			ints[L] = ints[R];
			ints[R] = temp;
		}
		for (int i=0; i<w; i++) {
			System.out.println(ints[i]);
		}
	}
}
