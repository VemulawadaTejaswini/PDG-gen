import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		int[] counts = new int[length];
		int rCount = 0;
		for (int i = 0; i < length; i++) {
		    if (arr[i] == 'R') {
		        rCount++;
		    } else {
		        counts[i - 1] += rCount / 2 + rCount % 2;
		        counts[i] += rCount / 2;
		        rCount = 0;
		    }
		}
		int lCount = 0;
		for (int i = length - 1; i >= 0; i--) {
		    if (arr[i] == 'L') {
		        lCount++;
		    } else {
		        counts[i + 1] += lCount / 2 + lCount % 2;
		        counts[i] += lCount / 2;
		        lCount = 0;
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
		    if (i > 0) {
		        sb.append(" ");
		    }
		    sb.append(counts[i]);
		}
		System.out.println(sb);
   }
}
