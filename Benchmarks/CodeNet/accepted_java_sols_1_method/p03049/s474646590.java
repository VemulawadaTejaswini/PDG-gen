import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		int enda = 0, startb = 0, startbenda = 0;
		for(int i = 0; i < N; i++) {
			char[] s = sc.next().toCharArray();
			for(int j = 0; j < s.length-1; j++) {
				if(s[j] == 'A' && s[j+1] == 'B')
					ans++;
			}
			if(s[0] == 'B' && s[s.length-1] == 'A')
				startbenda++;
			if(s[0] == 'B')
				startb++;
			if(s[s.length-1] == 'A')
				enda++;			
		}
		ans += Math.min(enda, startb);
		if(enda == startbenda && startb == startbenda && startbenda != 0)
			ans--;
		System.out.println(ans);

	}

}
