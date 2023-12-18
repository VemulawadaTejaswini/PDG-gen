import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] a = new long[N];
        long sum = 1;
        long kijun = 100000;
        kijun *= 100000;
        kijun *= 100000;
        kijun *= 1000;
        boolean iszero = false;
        boolean isover = false;
        for(int i=0; i<N; i++) {
            a[i] = Long.parseLong(sc.next());
            if(a[i] == 0) {
                iszero = true;
            }
        }
        Arrays.sort(a);
        long shou = 0;
        for(int i=0; i<N; i++) {
            sum *= a[i];
            if(sum > kijun) {
                isover = true;
            }
        }
        
        if(iszero) {
            System.out.println(0);
        }else if(isover) {
            System.out.println(-1);
        }else {
            System.out.println(sum);
            
        }
        
    }
}
