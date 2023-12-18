import java.math.BigDecimal;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal[] a = new BigDecimal[n];
 
        BigDecimal result = new BigDecimal(1);
        BigDecimal max = new BigDecimal(1000000000000000000L);
        for(int i=0; i < n; i++){
            a[i] = sc.nextBigDecimal();
            if(a[i].compareTo(BigDecimal.ZERO) == 0) {
                System.out.println(0);
                return;
            }
        }
 
        for(int i=0; i < n; i++){
            result = result.multiply(a[i]);
            if(result.compareTo(max) > 0){
                System.out.println(-1);
                return;
            }
        }
 
        System.out.println(result);
    }
}