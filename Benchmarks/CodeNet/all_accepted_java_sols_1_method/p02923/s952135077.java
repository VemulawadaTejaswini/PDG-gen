import java.util.*;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] h = new int[n];
		for(i=0;i<n;i++) {
			h[i] = parseInt(sc.next());
		}
		sc.close();
		int mx=0;
		int cnt=0;
		for(i=0;i<n-1;i++) {
			if(h[i] >= h[i+1]) {
				cnt++;
			} else {
				if(cnt>mx) {
					mx=cnt;
				}
				cnt = 0;
			}
		}
		if(cnt>mx) {
			mx=cnt;
		}
		out.println(mx);
	}
}
