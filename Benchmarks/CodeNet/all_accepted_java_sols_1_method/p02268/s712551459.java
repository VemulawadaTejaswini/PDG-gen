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
        long t = 0;
        
        int ans = 0;
        for(int i = 0; i < q; i++){
            t = sc.nextLong();
            int left = 0;
            int right = n;
            while(left < right){
                int mid = (left + right)/2;
                if(s[mid] == t){
                    ans ++;
                    break;
                }else if(t < s[mid]){
                    right = mid;
                }else{
                    left = mid + 1;
                }
            }
        }
        
        
        System.out.println(ans);
    }
}

