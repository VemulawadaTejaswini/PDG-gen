import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        int R = Integer.parseInt(arr[0]);
        int G = Integer.parseInt(arr[1]);
        int B = Integer.parseInt(arr[2]);
        int N = Integer.parseInt(arr[3]);
        int ans = 0;

        int[] arr2 = new int[] { R, G, B };
        Arrays.sort(arr2);

        int n1 = arr2[2];
        int n2 = arr2[1];
        int n3 = arr2[0];

        for (int i = 0; i * n1 <= N; i++) {
            int rest1 = N - i * n1;
            for (int j = 0; j * n2 <= rest1; j++) {
                int rest2 = rest1 - j * n2;
                if (rest2 % n3 == 0) {
                    ans++;
                }
            }
        }

        out.println(ans);
        out.close();
    }
}
