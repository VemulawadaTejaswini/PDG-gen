import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vec = new int[n];
        for (int i = 0; i < n; i++) {
            vec[i] = sc.nextInt();
        }
        int ans = 0;
        Arrays.sort(vec);
        for (int i = 2; i < n; i++) {
            int l = 0, r = i - 1;
            while(l < r) {
                if (vec[l] + vec[r] > vec[i]) {
                    ans += (r - l);
                    --r;
                } else {
                    ++l;
                }
            }
        }
        System.out.println(ans);
    }
}