import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a == 1 && b == 1) {
            System.out.println(1);
            return;
        }
        if(a == 1) {
            System.out.println(b - 2);
            return;
        }
        if(b == 1) {
            System.out.println(a - 2);
            return;
        }
        System.out.println((a - 2) * (b - 2));
    }
}
