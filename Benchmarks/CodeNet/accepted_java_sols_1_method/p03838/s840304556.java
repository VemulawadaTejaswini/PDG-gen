import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long x = 0;
    static long y = 0;
    static long ans = 0;

    public static void main(String[] args) {
        x = sc.nextLong();
        y = sc.nextLong();
        
        if(x <= y) ans = (x >= 0) ? y - x : (-x <= y) ? 1 + y + x : (0 < y) ? 1 - y - x : y - x;
        else ans = (y > 0) ? 2 - y + x : (y == 0) ? 1 + x : (-y <= x) ? 1 + y + x : (0 <= x) ? 1 - y - x : 2 - y + x;
        System.out.println(ans);
    }
}