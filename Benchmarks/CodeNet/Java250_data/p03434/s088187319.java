import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int [n];
        for(int i = 0; i < n; ++i) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        int cnt1 = 0,cnt2 = 0;
        boolean al = true;
        for(int i = n - 1; i >= 0; --i) {
            if(al) {
                al = false;
                cnt1 += a[i];
            }
            else {
                al = true;
                cnt2 += a[i];
            }
        }
        System.out.println(cnt1 - cnt2);
    }
}
