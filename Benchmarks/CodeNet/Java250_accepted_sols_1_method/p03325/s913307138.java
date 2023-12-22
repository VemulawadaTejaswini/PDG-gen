import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        long ans = 0;
        for (int i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
            while (arr[i] % 2 == 0) {
                arr[i] /= 2;
                ++ans;
            }
        }

        System.out.println(ans);
    }
}