import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		int n = sc.nextInt();
		long[] starts = new long[n + 1];
		long[] ends = new long[n + 1];
		long[] times = new long[n + 1];
		for (int i = 1; i <= n; i++) {
		    starts[i] = sc.nextLong();
		    ends[i] = sc.nextLong();
		    times[i] = times[i - 1] + ends[i] - starts[i];
		}
		int right = 1;
		long max = 0;
		for (int left = 1; left <= n; left++) {
		    while(right < n && starts[left] + t >= ends[right]) {
		        right++;
		    }
		    long time = times[right - 1] - times[left - 1];
		    if (starts[left] + t >= ends[right]) {
		        time += ends[right] - starts[right];
		    } else if (starts[left] + t >= starts[right]) {
		        time += starts[left] + t - starts[right];
		    }
		    max = Math.max(max, time);
		}
	    System.out.println(max);
	}
}

