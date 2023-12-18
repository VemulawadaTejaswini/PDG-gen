
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner sc = new Scanner(is);
        long ans = 0;

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list, Collections.reverseOrder());

        ans += list.get(0);
        int th = 1;
        int times = 1;
        while (times < N-1) {
            ans += list.get(th);
            times++;
            if(times == N-1) break;
            ans += list.get(th);
            times++;
            th++;
        }

        os.println(ans);
    }
}