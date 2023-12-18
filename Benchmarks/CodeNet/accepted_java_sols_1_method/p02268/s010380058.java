import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s[] = new int[n];
        for (int i = 0; i < n; i++)
            s[i] = sc.nextInt();
        int q = sc.nextInt();
        int t[] = new int[q];
        for (int i = 0; i < q; i++)
            t[i] = sc.nextInt();

        int cnt = 0;
        for (int query = 0; query < q; query++) {
            int index = Arrays.binarySearch(s, t[query]);
            if (index < 0) {
                continue;
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);

        sc.close();
    }
}
