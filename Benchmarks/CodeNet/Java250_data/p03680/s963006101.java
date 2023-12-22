import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            t--;
            a.add(t);
        }
        int ans = 0;
        int now = 0;
        for(int i = 0; i < n+1; i++){
            if(now == 1)break;
            ans++;
            now = a.get(now);
        }
        if(ans > n) ans = -1;
        out.println(ans);
        out.flush();
	}
}