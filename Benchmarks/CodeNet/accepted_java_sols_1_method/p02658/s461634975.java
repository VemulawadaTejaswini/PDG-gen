import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger max = new BigInteger("1000000000000000000");
        BigInteger ans = new BigInteger("1");

        long[] A = new long[N];
        for (int i = 0; i < N ; i++) {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);

        for (long val : A) {
            if(val==0){
                System.out.println(0);
                return;
            }
            ans = ans.multiply(new BigInteger(val+""));
            if(ans.compareTo(max)>0){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans);
    }
}