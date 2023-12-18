import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] sArr = sc.next().toCharArray();
		int length = sArr.length;
		TreeSet<Long>[] sets = new TreeSet[26];
		for (int i = 0; i < 26; i++) {
		    sets[i] = new TreeSet<>();
		}
		for (int i = 0; i < length; i++) {
		    sets[sArr[i] - 'a'].add(Long.valueOf(i));
		}
		char[] tArr = sc.next().toCharArray();
		long prev = 0;
		for (char c : tArr) {
		    Long x = sets[c - 'a'].ceiling(prev % length);
		    if (x == null) {
		        prev = (prev / length + 1) * length;
		        x = sets[c - 'a'].ceiling(prev % length);
		        if (x == null) {
		            System.out.println(-1);
		            return;
		        }
		        prev += x;
		    } else {
		        prev = prev / length * length + x;
		    }
		    prev++;
		}
		System.out.println(prev);
   }
}
