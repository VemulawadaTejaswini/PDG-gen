import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] seq = new int[n];
		int ret = 0;
		HashMap<Integer, Integer> subseq = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < seq.length; i++) {
			seq[i] = in.nextInt();
		}
		
		for (int k = 1; k <= n; k++) {
			ret = 0;
			int left = 0;
			int right = left + k - 1;
			while(right<n){
				int sub = subseq(seq, left, right);
				subseq.put(sub, 0);
				left++;
				right++;
			}
		}
		
		while(true){
			if(!subseq.containsKey(ret)){
				System.out.println(ret);
				return;
			}
			ret++;
		}
	}

	static int subseq(int[] seq, int left, int right) {
		int ret = 0;
		for (int i = left; i <= right; i++) {
			ret *= 10;
			ret += seq[i];
		}
		return ret;
	}
}