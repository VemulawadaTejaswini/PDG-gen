import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String [] s = sc.next().split("");

        long k = sc.nextLong();

        long sum = 0;

        int ans = 0;

        for (int i = 0; i < s.length; i++) {
            int value = Integer.parseInt(s[i]);
            if (value == 1) {
                sum += 1;
            }
            if (sum >= k || value != 1) {
                ans = value;
                break;
            }
        }

        System.out.println(ans);
    }
}