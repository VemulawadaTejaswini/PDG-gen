
import java.util.*;
public class Main  {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double odd = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                odd++;
            }

        }

        System.out.printf("%.10f\n",  (odd / n));


    }

}
