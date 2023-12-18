import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ans = 0;
        double n = sc.nextDouble();
        double k = sc.nextDouble();

        for(int i = 1; i <= n; i++){
            double temp = 1 / n;

            int now = i;
            while(now < k){
                now *= 2;
                temp /= 2;
            }
            ans += temp;
        }

        System.out.println(ans);
        return;
    }
}
