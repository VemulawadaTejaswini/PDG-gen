import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        Arrays.fill(b, -1);
        int max = 0;
        for (int i = 0; i < n; i++) {
            int l = -1, r = n-1;
            while(1 < r-l){
                int m = (l + r) / 2;
                if(b[m] < a[i]) r = m;
                else l = m;
            }
             b[r] = a[i];
            if(max < r) max = r;
        }
        System.out.println(max+1);
        sc.close();

    }

}
