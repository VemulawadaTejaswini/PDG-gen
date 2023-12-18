import  java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long x = cin.nextLong();
        long ans = 0;
        long d1 = (long)x/500;
        x = x - 500*d1;
        ans += d1*1000;
        d1 = (long)x/5;
        ans += d1*5;
        System.out.println(ans);
    }
}