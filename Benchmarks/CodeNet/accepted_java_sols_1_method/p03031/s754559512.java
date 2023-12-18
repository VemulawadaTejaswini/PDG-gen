import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] k = new int[m];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            k[i] = Integer.parseInt(sc.next());
            List<Integer> sList = new ArrayList<>();
            for (int j = 0; j < k[i]; j++) {
                int s = Integer.parseInt(sc.next()) - 1;
                sList.add(s);
            }
            list.add(sList);
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        long ans = 0;
        for (int i = 0; i < (1 << n); i++) {
            boolean isOk = true;
            for (int j = 0; j < m; j++) {
                int cnt = 0;
                for (int l = 0; l < k[j]; l++) {
                    int temp = list.get(j).get(l);
                    if ((i >> temp & 1) == 1) {
                        cnt++;
                    }
                }
                if (cnt % 2 != p[j]) {
                    isOk = false;
                }
            }
            if (isOk) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}