import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		int k = sc.nextInt();
		int MAX = 200001;
		int[] a = new int[MAX];
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < n; i++) {
			int ai = sc.nextInt();
			a[ai]++;
			set.add(ai);
		}

		Arrays.sort(a);

		int cnt = 0;
		int setSize = set.size();
		for (int i = MAX - setSize; i < MAX - k; i++) {
			cnt += a[i];
		}

		System.out.println(cnt);
	}
}
