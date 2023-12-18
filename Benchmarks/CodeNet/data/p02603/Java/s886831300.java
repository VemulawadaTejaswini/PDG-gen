import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int left = 1000;
        int lastLow = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int today = sc.nextInt();
            if (today > lastLow) {
                int pos = left / lastLow;
                left -= pos * lastLow;
                left += pos * today;
            }
            lastLow = today;
        }
        System.out.println(left);
    }
}