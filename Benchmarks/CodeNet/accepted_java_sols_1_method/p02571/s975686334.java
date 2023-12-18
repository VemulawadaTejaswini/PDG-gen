import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] c = sc.next().toCharArray();
		int ans = Integer.MAX_VALUE;

		for(int i = 0;i <= s.length-c.length; ++i) {
			int j = 0, k = i, count = 0;
			while(j < c.length) {
				if(c[j++] != s[k++]) count++;
			}
			ans = Math.min(ans,count);
		}
		System.out.println(ans);
	}
}