import java.util.*;

public class Main {
    static TreeSet<Integer> all = new TreeSet<>();
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int x = sc.nextInt();
		    int left = 0;
		    int right = n;
		    while (right - left > 1) {
		        int m = (left + right) / 2;
		        if (arr[m] <= x) {
		            left = m;
		        } else {
		            right = m;
		        }
		    }
		    if (arr[left] == x) {
		        sb.append("1");
		    } else {
		        sb.append("0");
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
}

