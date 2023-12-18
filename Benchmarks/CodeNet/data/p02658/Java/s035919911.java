import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<BigInteger> A = new ArrayList<>();
        for(int i=0;i<N; i++){
            A.add(BigInteger.valueOf(sc.nextInt()));
        }
        sc.close();
        BigInteger ans = BigInteger.ONE;
        for(BigInteger num : A){
            ans = ans.multiply(num);
        }
        BigInteger flag = new BigInteger("10000000000000000000");
        if(ans.compareTo(flag) == -1){
          System.out.println(ans);
        }else{
           System.out.println(-1);
        }
    }
}
