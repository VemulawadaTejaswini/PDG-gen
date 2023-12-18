import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	 	int n = sc.nextInt();
		int[] a = new int[n];
    int all = 0;
		int prev_a = 0;
		for (int i = 0; i < n; i++) {
			int ai = sc.nextInt();
      all += Math.abs(ai - prev_a);
      a[i] = ai;
			prev_a = ai;
		}
		all += Math.abs(0 - prev_a);

    for (int i = 0; i < n; i++) {
      int prev = (i == 0) ? 0 : a[i - 1];
      int mid = a[i];
      int next = (i == n - 1) ? 0 : a[i + 1];

      int x = Math.abs(mid - prev);
      int y = Math.abs(next - mid);
      int z = Math.abs(next - prev);
      System.out.println(all - x - y + z);
    }
  }
}
