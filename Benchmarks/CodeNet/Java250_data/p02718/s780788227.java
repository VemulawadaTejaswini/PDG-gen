import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sc.close();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if ((double)a[i] >= (double)sum / (4*m)) cnt++;
        }
        String res = "No";
        if (m <= cnt) res = "Yes";
        
        System.out.println(res);
    }
}