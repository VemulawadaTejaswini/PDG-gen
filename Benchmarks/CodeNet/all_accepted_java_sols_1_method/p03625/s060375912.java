import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		HashSet<Long> set = new HashSet<>();
		long another = 0;
		for (int i = n - 1; i >= 0; i--) {
		    long a = arr[i];
		    if (set.contains(a)) {
		        if (another == 0) {
		            another = a;
		            set.remove(a);
		        } else {
		            System.out.println(another * a);
		            return;
		        }
		    } else {
		        set.add(a);
		    }
		}
        System.out.println(0);
	}
}
