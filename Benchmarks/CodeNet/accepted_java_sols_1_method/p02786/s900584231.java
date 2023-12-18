
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long num = 1;
        long res = 0;
        while( h > 1) {
            res += num;
            num *= 2;
            h /= 2;
        }
        res += num;
        System.out.println(res);


    }

}
