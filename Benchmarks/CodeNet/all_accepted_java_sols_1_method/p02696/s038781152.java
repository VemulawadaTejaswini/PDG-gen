import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), n = sc.nextLong();
        long x = 0;
      	if (n < b) {
            x = n;
        }
        else if (n > b) {
            x = b - 1;
        }
        else {
            x = b > 1 ? b - 1 : 1;
        }
        long ans = (a * x)/b;
        if (b == 1) {
            ans = 0;
        }

        System.out.println(ans);
    }
}