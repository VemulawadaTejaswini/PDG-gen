import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();

        long cnt = 0;
        while(X <= Y){
            X *= 2;
            cnt++;
        }

        out.println(cnt);
    }
}