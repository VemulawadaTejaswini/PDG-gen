import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        var a = new int[n];
        var b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        if(n%2 == 1){
            System.out.println(b[n/2] - a[n/2] + 1);
        }else{
            var a2 = BigDecimal.valueOf(a[n/2-1]).add(BigDecimal.valueOf(a[n/2]));
            a2 = a2.divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_EVEN);
            var b2 = BigDecimal.valueOf(b[n/2-1]).add(BigDecimal.valueOf(b[n/2]));
            b2 = b2.divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_EVEN);
            var ans = BigDecimal.ONE.add(b2.subtract(a2).multiply(BigDecimal.valueOf(2)));
            System.out.println(ans.setScale(0, RoundingMode.HALF_EVEN));
        }
    }
}