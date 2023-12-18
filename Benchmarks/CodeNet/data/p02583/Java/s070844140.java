import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    private void slove() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        //a = Arrays.stream(a).distinct().toArray();
        int len = a.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                for (int k = j+1; k < len; k++) {
                    int d = a[i];
                    int b = a[j];
                    int c = a[k];
                    if (b == c || c == d || d == b) {
                        continue;
                    }
                    int[] s = {b,c,d};
                    Arrays.sort(s);
                    if (s[0] + s[1] > s[2]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
