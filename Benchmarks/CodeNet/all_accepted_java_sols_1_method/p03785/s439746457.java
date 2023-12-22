import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        long[] li = new long[n];
        for(int i = 0; i < n; i++){
            li[i] = sc.nextLong();
        }
        Arrays.sort(li);
        long firstT = 0;
        long pass = 0;
        int ans = 1;
        for(int i = 0; i < n; i++){
            long t = li[i];
            if(pass == 0){
                firstT = t;
                pass++;
            }else if(firstT + k < t){
                ans++;
                firstT = t;
                pass = 1;
            }else{
                pass++;
            }
            if(pass == c){
                pass = 0;
                if(i != n-1) ans++;
            }
        }
        System.out.println(ans);
    }
}