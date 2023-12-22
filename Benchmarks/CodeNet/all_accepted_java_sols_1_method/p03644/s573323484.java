import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double ans = 1;
        for (int i=1; i<=n; i++) {
            double pwr = Math.pow(2, i);
            if (pwr > n) {
                System.out.println((int) ans);
                return;
            }
            ans = pwr;
        }
   }
}
