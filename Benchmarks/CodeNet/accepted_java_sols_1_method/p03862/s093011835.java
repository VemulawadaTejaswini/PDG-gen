import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] al = new long[n];
        for(int i = 0; i < n; i++){
            al[i] = sc.nextLong();
        }
        long ans = 0;
        for(int i = 0; i < n-1; i++){
            long tmp = al[i] + al[i+1];
            if(tmp <= x){
                continue;
            }else if(tmp - x > al[i+1]){
                al[i+1] = 0;
                al[i] -= tmp - x - al[i+1];
            }else{
                al[i+1] -= (tmp-x);
            }
            ans += tmp-x;
        }
        System.out.println(ans);
    }
}
