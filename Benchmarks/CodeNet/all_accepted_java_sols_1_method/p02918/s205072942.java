import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        char C[] = sc.next().toCharArray();
        sc.close();

        int cnt = 0;
        for (int i=1; i<N; i++) {
            if (C[i]==C[i-1])
                cnt++;
        }
        if (cnt+2*K>N-1) {
            cnt = N-1;
        } else {
            cnt += 2*K;
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(cnt);
        out.flush();
    }
}