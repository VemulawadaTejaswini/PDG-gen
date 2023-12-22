import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] list = new Integer[n];

        for(int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list, Comparator.reverseOrder());

        int ans = 0;
        for(int i = 0; i < n - 2; i++) {
            int a = list[i];
            for (int i1 = i + 1; i1 < n - 1; i1++) {
                int b = list[i1];
                if (2 * b < a) {
                    break;
                }
                for(int i2 = i1 + 1; i2 < n; i2++) {
                    int c = list[i2];
                    if (a < b + c && b < c + a && c < a + b) {
                        ans++;
                    }
                }
            }
        }

        // 出力
        System.out.println(ans);
    }
}
