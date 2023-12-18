import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = 0;
        int r = 1_000_000_000;
        while(1 < r-l){
            int m = (l+r)/2;
            int c = 0;
            for (int i = 0; i < n; i++) {
                c += (a[i] + m -1) / m -1;
            }
            if(c <= k) r = m;
            else l = m;
        }
        System.out.println(r);
        sc.close();

    }

}
