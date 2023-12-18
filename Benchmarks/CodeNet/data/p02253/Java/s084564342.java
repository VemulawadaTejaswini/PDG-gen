import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Work[] works = new Work[n];
		for (int i = 0; i < n; i++) {
		    works[i] = new Work(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(works);
		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		int max = 0;
		for (Work w : works) {
		    int left = 0;
		    int right = max + 1;
		    while (right - left > 1) {
		        int m = (left + right) / 2;
		        if (dp[m] < w.left) {
		            left = m;
		        } else {
		            right = m;
		        }
		    }
		    dp[left + 1] = Math.min(dp[left + 1], w.right);
		    max = Math.max(max, left + 1);
		}
		System.out.println(max);
	}
	
	static class Work implements Comparable<Work> {
	    int left;
	    int right;
	    
	    public Work(int left, int right) {
	        this.left = left;
	        this.right = right;
	    }
	    
	    public int compareTo(Work another) {
	        return right - another.right;
	    }
	}
 }

