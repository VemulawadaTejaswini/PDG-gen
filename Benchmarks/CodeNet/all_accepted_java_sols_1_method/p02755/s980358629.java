import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long a = stdIn.nextLong();
        long b = stdIn.nextLong();

        long l1, r1, l2, r2;
        if(a % 2 == 0){
            l1 = 25 * a / 2;
        }else{
            l1 = 25 * a / 2 + 1;
        }
        if((a + 1) % 2 == 0){
            r1 = 25 * (a + 1) / 2 - 1;
        }else{
            r1 = 25 * (a + 1) / 2;
        }
        l2 = 10 * b;
        r2 = 10 * (b + 1) - 1;

        if(r1 < l2 || r2 < l1){
            System.out.println(-1);
        }else{
            System.out.println((l1 < l2) ? l2 : l1);
        }
    }
}