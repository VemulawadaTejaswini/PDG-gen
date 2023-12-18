import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt() * 1.0;
        double m = sc.nextInt() * 1.0;
        double d = sc.nextInt() * 1.0;
        double c1,c2;
        if(d == 0){
            c1 = n; c2 = 0;
        }else if(d*2 <= n){
            c1 = d*2; c2 = n - d*2;
        }else{
            c1 = (n-d)*2; c2 = 0;
        }
        double ans = (2.0 * c2 + c1) / n / n * (m-1.0);
        System.out.println(ans);
        sc.close();

    }

}
