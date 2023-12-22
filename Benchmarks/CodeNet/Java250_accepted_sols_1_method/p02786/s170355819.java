import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long ans = 1;
        long count = 1;
        while (h > 1) {
            h = h/2;
            ans += Math.pow(2, count);
            count++;
        }
        System.out.println(ans);
    }

}
