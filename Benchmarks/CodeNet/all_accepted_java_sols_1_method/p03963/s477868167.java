import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);

        int N, K, ans;

        N = sc.nextInt();
        K = sc.nextInt();

        ans = K;
        for(int i = 1; i < N; i++) {
            ans *= K-1;
        }

        out.println(ans);
        sc.close();
    }
}