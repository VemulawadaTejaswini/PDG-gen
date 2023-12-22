import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
		    set.add(sc.nextInt());
		}
		int min = Integer.MAX_VALUE;
		int minvalue = 0;
		for (int i = x - 100; i <= x + 100; i++) {
		    if (!set.contains(i)) {
		        if (min > Math.abs(x - i)) {
		            min = Math.abs(x - i);
		            minvalue = i;
		        }
		    }
		}
	    System.out.println(minvalue);
	}
}
