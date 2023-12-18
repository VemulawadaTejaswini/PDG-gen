import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        if (N == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a[1]);
            sb.append(" ");
            sb.append(a[0]);
            System.out.println(sb.toString());
            return;
        }
        int[] ans = new int[N];
        for (int i = 0; i < N - 4; i++) {
            int x = a[i];
            int y = a[i+1];
            int z = a[i+2];
            ans[i+3] = x^y^z;
        }
        int t = a[0] ^ a[N-1];
        ans[0] = t ^ ans[N-1];
        t = a[0] ^ a[1];
        ans[1] = t ^ ans[0];
        t = a[1] ^ a[2];
        ans[2] = t ^ ans[1];
        System.out.println(Arrays.stream(ans).mapToObj(i -> Integer.toString(i)).collect(Collectors.joining(" ")));
    }
}
