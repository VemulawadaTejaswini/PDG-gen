import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long max = Math.max(a, b);
        int sqrt = (int) Math.sqrt(max)+1;
        boolean[] used = new boolean[sqrt+1];
        int ans = 1;
        for (int i = 2; i <= sqrt; i++) {
            if(used[i])continue;
            if(a  % i == 0 && b % i == 0) ans++;
            for (int j = i; j <= sqrt; j += i) {
                used[j] = true;
            }
            while(max % i == 0) max /= i;
        }
        if(1 < max && a % max == 0 && b % max == 0) ans++;
        System.out.println(ans);
        sc.close();

    }

}
