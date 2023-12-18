import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        long ans = (b * (n-1) + a) - (a * (n-1) + b) + 1;
        if (ans <= 0) System.out.println(0);
        else System.out.println(ans);
    }
}