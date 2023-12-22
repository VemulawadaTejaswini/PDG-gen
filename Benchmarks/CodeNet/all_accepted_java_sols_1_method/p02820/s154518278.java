import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		int k = Integer.parseInt(in.next());
		int s = Integer.parseInt(in.next());
		int p = Integer.parseInt(in.next());
		int r = Integer.parseInt(in.next());
		char[] game = in.next().toCharArray();
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(i < k) {
				if(game[i] == 's') ans += s;
				else if(game[i] == 'p') ans += p;
				else ans += r;
			}else {
				if(game[i - k] == game[i]) game[i] = '.';
				else {
					if(game[i] == 's') ans += s;
					else if(game[i] == 'p') ans += p;
					else ans += r;
				}
			}
		}
		System.out.println(ans);
	}
}