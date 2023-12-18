import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n >= m) {
		    System.out.println(0);
		    return;
		}
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int total = arr[m - 1] - arr[0];
		int[] dis = new int[m - 1];
		for (int i = 0; i < m - 1; i++) {
		    dis[i] = arr[i + 1] - arr[i];
		}
		Arrays.sort(dis);
		int save = 0;
		for (int i = 1; i < n; i++) {
		    save += dis[m - 1 - i];
		}
		System.out.println(total - save);
	}
}
