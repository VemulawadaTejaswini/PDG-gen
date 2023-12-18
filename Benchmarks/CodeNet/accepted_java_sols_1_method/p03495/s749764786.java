

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int cnt[] = new int[200001];
            Arrays.fill(cnt, 0);
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                cnt[a]++;
            }
            List<Integer> cntList = new ArrayList<>();
            for (int i = 0; i < 200001; i++) {
                if ( cnt[i] > 0 ) {
                    cntList.add(cnt[i]);
                }
            }
            Collections.sort(cntList);

            int ans = 0;
            for (int i = 0; i < cntList.size() - k; i++) {
                ans += cntList.get(i);
            }
            System.out.println(ans);
        }
    }
}
