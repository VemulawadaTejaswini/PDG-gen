import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double ans = 0.0;
        int b = 1;
        int r = 0;
        while(b < k) {
            b *= 2;
            r++;
        }
        for (int i = 1; i <= n; i++) {
            if(1 < b && k <= (b / 2) * i){
                b /= 2;
                r--;
            }
            ans += (Math.pow(0.5, r)) / n;
        }
        System.out.println(ans);
        sc.close();

    }

}
