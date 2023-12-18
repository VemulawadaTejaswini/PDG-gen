import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long N = sc.nextLong();
        sc.close();
        Long min = N+1;

        for(long i = 1; i <= Math.sqrt(N); i++){
            if((N % i) == 0){
                long j = N / i;
                if(min > i+j){
                    min = i+j;
                }   
            }
        }

        System.out.println(min-2);

    }
}