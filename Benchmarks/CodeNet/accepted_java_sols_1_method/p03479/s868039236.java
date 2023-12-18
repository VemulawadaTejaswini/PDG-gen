import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long ans = 0;

        long mul = x;
        while(mul <= y) {
            mul *= 2;
            ans++;
        }
        System.out.println(ans);
    }
}
