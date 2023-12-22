import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            int b_end = b + w;
            if (a - b_end > 0) {
                System.out.println(a - b_end);
            } else {
                System.out.println(0);
            }
            return;
        } else if (b > a) {
            int a_end = a + w;
            if (b - a_end > 0) {
                System.out.println(b - a_end);    
            } else {
                System.out.println(0);
            }
            return;
        } else {
            System.out.println(0);
        }
    }
}
