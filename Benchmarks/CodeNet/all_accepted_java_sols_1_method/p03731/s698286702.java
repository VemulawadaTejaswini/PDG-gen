import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        if(n == 1) {
            System.out.println(t);
            return;
        }
        long maxTime = (long)n * t;
        int prevTime = sc.nextInt();
        for(int i = 0; i < n - 1; i++) {
            int currentTime = sc.nextInt();
            int diff = currentTime - prevTime;
            if(diff < t) {
                maxTime -= (t - diff);
            }
            prevTime = currentTime;
        }
        System.out.println(maxTime);
    }
}

