import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int base = 7;
		int idx = 1;
		HashSet<Integer> set = new HashSet<>();
		while (true) {
		    if (base % k == 0) {
		        System.out.println(idx);
		        return;
		    }
		    if (set.contains(base % k)) {
		        break;
		    }
		    set.add(base % k);
		    idx++;
		    base = (base * 10 + 7) % k;
		}
		System.out.println(-1);
	}
}
