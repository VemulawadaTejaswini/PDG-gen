import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        for (int i=0; i<Math.min(k, 100); i++) {
            int[] tmp = new int[n];
            for (int j=0; j<n; j++) {
                int l = Math.max(0, j-arr[j]);
                int r = Math.min(n-1, j+arr[j]);
                tmp[l]++;
                if (r+1<n) tmp[r+1]--;
            }
//            for (int j=0; j<n; j++) System.out.println(tmp[j]);
            for (int j=0; j<n-1; j++) {
                tmp[j+1] += tmp[j];
            }
            arr = tmp;
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) sb.append(arr[i] + " ");

        System.out.println(sb.toString());

    }
}
