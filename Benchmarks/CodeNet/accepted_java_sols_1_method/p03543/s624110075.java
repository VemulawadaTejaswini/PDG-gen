import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n % 10;
        n /= 10;
        int b = n % 10;
        n /= 10;
        int c = n % 10;
        n /= 10;
        int d = n % 10;
        if (a == b && b == c) {
            System.out.println("Yes");
        } else if (b == c && c == d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}