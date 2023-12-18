import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int[] counts = new int[n];
		int[] idxes = new int[]{-1, -1, -1};
		for (int i = 0; i < n; i++) {
		    int cnt = 0;
		    for (int j = 0; j < 3; j++) {
		        if (arr[i] - 1 == idxes[j]) {
		            counts[i]++;
		        }
		    }
		    if (counts[i] == 0) {
		        System.out.println(0);
		        return;
		    }
		    for (int j = 0; j < 3; j++) {
		        if (arr[i] - 1 == idxes[j]) {
		            idxes[j] = arr[i];
		            break;
		        }
		    }
		}
		long total = 1;
		for (int i = 0; i < n; i++) {
		    total *= counts[i];
		    total %= MOD;
		}
		System.out.println(total);
	}
}
