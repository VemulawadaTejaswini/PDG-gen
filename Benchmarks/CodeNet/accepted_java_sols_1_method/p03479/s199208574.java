import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long ans = 1;
        while(true) {
            x *= 2;
            if(x > y) break;
            ans++;
        }
        System.out.println(ans);
    }
}