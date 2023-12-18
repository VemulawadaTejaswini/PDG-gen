import java.util.*;
import java.math.BigInteger; 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        BigInteger lin_sum = new BigInteger("0");
        BigInteger sq_sum = new BigInteger("0");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            BigInteger ele = new BigInteger(Integer.toString(a[i]));
            BigInteger sq = ele.multiply(ele);
            lin_sum = lin_sum.add(ele);
            sq_sum = sq_sum.add(sq);
        }
       BigInteger lin_sq = lin_sum.pow(2);
       BigInteger minus = lin_sq.subtract(sq_sum);
       BigInteger two = new BigInteger("2");
       BigInteger ans = minus.divide(two);
       BigInteger mx = new BigInteger("1000000007");
       ans = ans.mod(mx);
        System.out.println(ans);
    }
}