import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        long n = input.nextLong();
        long x = Math.min(b-1,n);
        long ans = (a*x/b) - a*(x/b);
        System.out.println(ans);
    }
}