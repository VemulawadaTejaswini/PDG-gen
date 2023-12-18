import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        if (n == 100) {
            if (d == 0) {
                System.out.println(101);
            } else if (d == 1) {
                System.out.println(10100);
            } else {
                System.out.println(1010000);
            }
        } else {
            System.out.print(n);
            for (int i = 0; i < d; i++) {
                System.out.print("00");
            }
            System.out.println();
        }
    }
}