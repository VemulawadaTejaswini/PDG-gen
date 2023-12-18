import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long min = Long.MAX_VALUE;
        long n = sc.nextLong();
        for(int i = 0; i < 5; i++) {
            min = Math.min(min, sc.nextLong());
        }
        if(n <= min) {
            System.out.println(5);
            return;
        }
        n -= min;
        long cnt = (n + min - 1) / min;
        System.out.println(5 + cnt);
    }
}
