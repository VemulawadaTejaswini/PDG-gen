import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();
        long t = 0;
        long ans = 0;
        if (k % 2 == 0) {
            t = n / k;
            ans += (t * t * t);
            t = ((n*2) / k +1)/2;
            ans += (t * t * t);
        } else {
            t = n / k;
            ans += (t * t * t);
        }

        System.out.println(ans);

    }
}
