import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int c = sc.nextInt();
        int g = gcd(w, h);
        System.out.println(w * h / g / g * c);
    }
    
    static int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return gcd(y, x % y);
        }
    }
}

