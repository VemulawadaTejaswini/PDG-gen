import java.util.Scanner;

/**
 * @author kep
 * @date 2019-10-17
 */
public class Main {

    private static int[] vis = new int[100005];
    private static long[] sum = new long[100005];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long x = scanner.nextLong();
        long mod = scanner.nextLong();
        long ans = 0;
        int index = 1;
        int startIndex = -1;
        for(;index<=n;index++){
            if(vis[(int)x] != 0){
                startIndex = vis[(int)x];
                break;
            }
            vis[(int)x] = index;
            sum[index] = sum[index-1]+x;
            ans += x;
            x = (x*x)%mod;
        }
        if(n >= index){
            n = n - index + 1;
            ans = ans + (n/(index-startIndex))*(sum[index-1]-sum[startIndex-1]);
            if(n%(index-startIndex) != 0){
                int xx = (int)(n%(index-startIndex));
                ans = ans + sum[startIndex+xx-1] -sum[startIndex-1];
            }
        }
        System.out.println(ans);
    }



}
