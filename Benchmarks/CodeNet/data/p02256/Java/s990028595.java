import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(Math.max(x, y), Math.min(x, y)));
    }
 
    private static int gcd(int x, int y) {
        int r = x % y;
        if(r == 0) return y;
        return gcd(y, r);
    }
}
