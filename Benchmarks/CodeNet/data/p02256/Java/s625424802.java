import java.util.*;

public class Main {

    static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    static int gcd(int x, int y) {
        if(x % y == 0) return y;
        else return gcd(y, x % y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x < y) swap(x, y);
        System.out.println(gcd(x, y));
    }
}
