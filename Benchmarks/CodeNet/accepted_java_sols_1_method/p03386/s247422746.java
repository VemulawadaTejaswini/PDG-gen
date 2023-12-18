import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final long A = Long.parseLong(sc.next());
        final long B = Long.parseLong(sc.next());
        final int K = Integer.parseInt(sc.next());
        Set<Long> set = new TreeSet<>();
        
        int cnt = 0;
        for (long i = A; i <= B; i++) {
            cnt++;
            if (cnt > K) {
                break;
            } else {
                set.add(i);
            }
        }
        
        cnt = 0;
        for (long i = B; i >= A; i--) {
            cnt++;
            if (cnt > K) {
                break;
            } else {
                set.add(i);
            }
        }
        
        set.forEach(i -> out.println(i));
        
        out.flush();
    }
}