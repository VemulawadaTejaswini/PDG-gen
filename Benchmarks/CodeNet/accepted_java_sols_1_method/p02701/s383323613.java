import java.util.*;

public class Main {
	static final int r = 1000000000 + 7;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		for (int i = 0; i < n; ++i)
			s[i] = sc.next();
		sc.close();
		int ans = 0;
		Arrays.sort(s);
		ans = 1;
		String st = s[0];
		for(int i = 1; i < n; ++i){
			String tmp = s[i];
			if(!st.equals(tmp)){
				st = tmp.substring(0);
				ans++;
			}
		}
		System.out.println(ans);
	}
}
