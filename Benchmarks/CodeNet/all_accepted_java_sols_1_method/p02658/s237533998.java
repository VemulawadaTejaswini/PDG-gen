import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        var a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = Long.parseLong(sc.next());
            if(a[i] == 0){
                System.out.println(0);
                return;
            }
        }
        var b = BigInteger.valueOf(1);
        for(int i = 0; i < n; i++){
            b = b.multiply(BigInteger.valueOf(a[i]));
            if(b.compareTo(BigInteger.valueOf(1_000_000_000_000_000_000L)) > 0){
                b = BigInteger.valueOf(-1);
                break;
            }
        }
        System.out.println(b);
    }
}