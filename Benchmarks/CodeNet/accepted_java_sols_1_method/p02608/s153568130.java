import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int t1 = i*i;
            if(n < t1)break;
            for (int j = 1; j <= n; j++) {
                int t2 = j*j + i*j + t1;
                if(n < t2)break;
                for (int k = 1; k <= n; k++) {
                    int t3 = k*k + i*k + j*k + t2;
                    if(n < t3)break;
                    a[t3]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(a[i] + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
