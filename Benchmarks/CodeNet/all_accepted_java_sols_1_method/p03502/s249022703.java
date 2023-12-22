import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        int m = n;
        while (m > 0) {
            f += m % 10;
            m /= 10;
        }
        if (n % f == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}