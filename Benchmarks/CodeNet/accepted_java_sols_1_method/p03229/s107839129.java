import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long ans = 0L;
        int m, sm;
        if(n % 2 == 0){
            m = n/2;
            sm = m-1;
        }else{
            m = n/2;
            sm = Math.abs(a[m-1]-a[m]) < Math.abs(a[m+1]-a[m])
                    ? m-1 : m+1;
        }
        for (int i = 0; i < n; i++) {
            ans += Math.abs(a[m] - a[i]) * 2;
        }
        ans -= Math.abs(a[m] - a[sm]);
        System.out.println(ans);
        sc.close();

    }

}
