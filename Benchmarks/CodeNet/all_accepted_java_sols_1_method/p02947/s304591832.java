import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];
		for (int i = 0; i < N; i++) {
			char[] sp = sc.next().toCharArray();
			Arrays.parallelSort(sp);
			s[i] = String.valueOf(sp);
		}
		Arrays.parallelSort(s);
 
		long ans = 0;
		long cnt = 1;
		for (int i = 1; i < N; i++) {
			if (s[i].equals(s[i - 1])) {
				cnt++;
			} else {
				ans += cnt * (cnt - 1) / 2;
				cnt = 1;
			}
		}
		ans += cnt * (cnt - 1) / 2;
		System.out.println(ans);
	}
}