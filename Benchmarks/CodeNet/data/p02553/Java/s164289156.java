import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final long a = sc.nextLong();
        final long b = sc.nextLong();
        final long c = sc.nextLong();
        final long d = sc.nextLong();
        
        long v = a * c;
        long w = a * d;
        long x = b * c;
        long y = b * d;
        
        System.out.println(Math.max(Math.max(v, w), Math.max(x, y)));
    }
}
