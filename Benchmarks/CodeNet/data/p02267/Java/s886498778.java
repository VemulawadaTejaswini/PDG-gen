import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] s = new long[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.nextLong();
        }
        int q = sc.nextInt();
        long[] t = new long[q];
        for(int i = 0; i < q; i++){
            t[i] = sc.nextLong();
        }
        Arrays.sort(s);
        int ans = 0;
        for(int i = 0; i < q; i++){
            for(int j = 0; j < n; j++){
                if(s[j] == t[i]){
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}

