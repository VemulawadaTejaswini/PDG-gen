import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n + 1];
		for (int i = 0; i < n; ++i)
			s[i] = sc.next();
		s[n] = "zzzzzzzzzzz";
		int m = sc.nextInt();
		String t[] = new String[m + 1];
		for (int i = 0; i < m; ++i)
			t[i] = sc.next();
		t[m] = "zzzzzzzzzzz";
		sc.close();
		int ans = 0, tmp = 0;
		Arrays.sort(s);
		Arrays.sort(t);
		int st = 0;
		for(int i = 0; i < n; ++i) {
			if(s[i].equals(s[i + 1])) ++tmp;
			else {
				++tmp;
				for(int j = st; j < m; ++j) {
					if(s[i].equals(t[j]))tmp--;
					else {
						if(s[i].compareTo(t[j]) < 0) {
							st = j - 1;
							if(st < 0)st = 0;
							break;
						}
						else st = j;
					}
				}
				ans = Math.max(ans,  tmp);
				tmp = 0;
			}
		}
		System.out.println(ans);
	}

}
