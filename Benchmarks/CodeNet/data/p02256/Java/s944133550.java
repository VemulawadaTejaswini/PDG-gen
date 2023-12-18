import java.util.Scanner;

public class Main {
    public static final int BIG_NUM = 200000000;
    public static final int MOD     = 100000007;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        System.out.println(gcd(Math.max(x, y), Math.min(x, y)));
    }
    
    public static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }else {
            return gcd(y, x % y);
        }
    }
}
