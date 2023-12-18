import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long k = in.nextLong();
        long ans = Math.min(k, a);
        k -= ans;
        k -= b;
        if(k>0) {
            ans -= Math.min(k, c);
        }
        System.out.println(ans);
    }
}
