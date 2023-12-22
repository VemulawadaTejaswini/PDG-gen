import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long minTime = Long.MAX_VALUE;
        for (int i = 0; i < 5; i += 1) {
            long time = sc.nextLong();
            if (time < minTime) {
                minTime = time;
            }
        }
        long time = N / minTime + (N % minTime == 0 ? 0 : 1) + 4;
        System.out.println(time);
    }

}
