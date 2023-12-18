import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Long[] tmp = new Long[n];
        
        for(int i=0; i<n; i++){
            tmp[i] = sc.nextLong();
        }
        Arrays.sort(tmp);
        
        Long ans = 0L;
        for(int j=0; j<n-k; j++){
            ans += tmp[j];
        }
        
        System.out.println(ans);
    }
}