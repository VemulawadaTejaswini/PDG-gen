import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            List<Integer> list = new ArrayList<>();
            int tmp = 0;
            for (int j = 0; j < 3; j++) {
                list.add(p[i + j]);
                if(j == 1) {
                    tmp = p[i + j];
                }
            }
            Collections.sort(list);
            if(list.get(1) == tmp) ans++;
        }
        System.out.println(ans);
    }
}
