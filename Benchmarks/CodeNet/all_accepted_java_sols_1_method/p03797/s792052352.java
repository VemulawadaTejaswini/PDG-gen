import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long cnt = 0;
        if(n * 2 <= m) {
            cnt = n;
            m -= n * 2;
            cnt += m / 4;
        } else {
            cnt = m / 2;
        }

        System.out.println(cnt);
    }


}