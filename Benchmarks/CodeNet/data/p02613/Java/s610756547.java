import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		String[] ans = new String[]{"AC", "WA", "TLE", "RE"};
		int[] counts = new int[ans.length];
		for (int i = 0; i < n; i++) {
		    String s = sc.next();
		    for (int j = 0; j < ans.length; j++) {
		        if (s.equals(ans[j])) {
		            counts[j]++;
		            break;
		        }
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.length; i++) {
		    sb.append(ans[i]).append(" x ").append(counts[i]).append("\n");
		}
		System.out.print(sb);
	}
}
