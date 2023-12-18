import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        long w = d * b;
        long x = c * b;
        long y = a * c;
        long z = a * d;
        
        long ans = Math.max(Math.max(w, x), Math.max(y, z));
        System.out.println(ans);

    }
}