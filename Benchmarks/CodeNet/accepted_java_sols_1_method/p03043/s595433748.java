import java.util.*;

class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double prob = 0;
        for(int i = 1; i <= n; i++){
            int cnt = 0;
            int num = i;
            while(num < k){
                num *= 2;
                cnt++;
            }
            prob += 1.0 / Math.pow(2.0, cnt);
        }
        System.out.println(prob / n);
    }
    
}