import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;
 
public class Main {
    private static final int N;
    private static final int K;
    private static int[] T;
    static{
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        T = new int[N];
        for(int i = 0; i < N; ++i) T[i] = sc.nextInt();
    }
    
    public static void main(String[] args) throws IOException {
        
        long max = 100000 * 10000;
        long min = 0;
        long mid;
        while(max - min > 1){
            mid = (max + min) / 2;
            if(isAllStackable(mid)) max = mid;
            else                    min = mid;
        }
        System.out.println(max);
    }
    
    private static boolean isAllStackable(long p){
        IntUnaryOperator getCount = i -> {
            long sum = 0;
            int j = 0;
            for(; i < N && (sum += T[i]) <= p; ++i) ++j;
            return j;
        };
        
        int cnt = 0;
        for(int j = 0; j < K && cnt < N; ++j)
            cnt += getCount.applyAsInt(cnt);
        return cnt >= N;
    } 
}
