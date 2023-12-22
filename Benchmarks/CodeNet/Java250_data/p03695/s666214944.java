import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] counts = new int[8];
		int over = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    int idx = x / 400;
		    if (idx >= 8) {
		        over++;
		    } else {
		        counts[idx]++;
		    }
		}
		int types = 0;
		for (int i = 0; i < counts.length; i++) {
		    if (counts[i] != 0) {
		        types++;
		    }
		}
		int max = types + over;
		int min = Math.max(types, 1);
		System.out.println(min + " " + max);
	}
}
