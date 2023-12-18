import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(ary);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            j: for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++ ) {
                    if (ary[i] + ary[j] > ary[k]) {
                        ans++;
                    } else {
                        continue j;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}