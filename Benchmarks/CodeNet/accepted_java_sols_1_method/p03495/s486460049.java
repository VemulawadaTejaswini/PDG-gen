import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() -1;
            if(a[x] == 0) c++;
            a[x]++;
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = n-c; i < n-k; i++) {
            ans += a[i];
        }

        System.out.println(ans);
        sc.close();

    }

}
