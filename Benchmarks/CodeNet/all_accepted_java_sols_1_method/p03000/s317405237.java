import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int P = 0;
        int count=1;
        for(int i=1; i<=N; i++) {
            P+=sc.nextInt();
            if(P<=X) count++;
        }
        System.out.println(count);
   }
}