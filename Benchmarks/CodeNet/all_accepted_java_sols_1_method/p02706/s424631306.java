import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();
        long a = 0;
        for (int i = 0; i < m; i++) {
            a += sc.nextLong();
        } 
        sc.close();

        if (n >= a) {
            System.out.println(n - a);
        } else {
            System.out.println(-1);
        }
    }
}
