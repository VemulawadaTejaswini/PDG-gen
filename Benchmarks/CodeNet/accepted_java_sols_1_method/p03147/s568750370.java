import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextLong();
        }
        long ans = 0;
        boolean isZero = false;
        while(!isZero){
            isZero = true;
            long prev = 0;
            for(int i = 0; i < n; i++){
                if(prev <= 0 && x[i] > 0){
                    ans++;
                    isZero = false;
                    prev = x[i];
                    x[i]--;
                }else if (prev > 0 && x[i] > 0){
                    prev = x[i];
                    x[i]--;
                }else{
                    prev = x[i];
                }
                
            }
        }
        System.out.println(ans);
    }
}
