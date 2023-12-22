import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int p = 2019;
        char[] s = sc.next().toCharArray();
        int n = s.length;
        long ans = 0;
        int[] cum = new int[n+1];
        int pow = 1;
        for(int i = n-1; i >= 0; i--){
            int tmp = ((s[i] - '0') * pow) % p;
            cum[i] = (cum[i+1]+tmp) % p;
            pow *= 10;
            pow %= p;
        }
        int[] counter = new int[p];
        for(int i = n; i >= 0; i--){
            ans += counter[cum[i]];
            counter[cum[i]]++;
        }
        System.out.println(ans);
    }
}
