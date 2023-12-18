import java.util.Scanner;

/**
 * Created by shoya on 2017/04/14.
 */
public class Main {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int INF = 1 << 30;
        int currentmin = INF;
        int maxpro = -INF;
        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            if (maxpro < a - currentmin)
                maxpro = a - currentmin;
            if (currentmin > a)
                currentmin = a;
        }
        System.out.println(maxpro);
        return;
    }
}