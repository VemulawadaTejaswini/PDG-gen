import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author : Ritchie Zhang
 * @date : 2020/5/10
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        boolean f = true;
        Scanner scanner = new Scanner(System.in);
        BigDecimal sum = BigDecimal.valueOf(1);
        BigDecimal[] a = new BigDecimal[100000];
        int n = scanner.nextInt();
        for(int j=0;j<n;j++){
               a[j] = scanner.nextBigDecimal();
        }
        for(int j=0;j<n;j++){
           sum = sum.multiply(a[j]);

        }
        if(sum.compareTo(BigDecimal.valueOf(Math.pow(10,18))) >0 ) {
            System.out.println(-1);
            f = false;
        }
        if(f == true){
            System.out.println(sum);
        }


    }

}
