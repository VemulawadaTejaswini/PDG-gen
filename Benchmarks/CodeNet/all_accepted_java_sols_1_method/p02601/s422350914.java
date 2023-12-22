import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            if (a >= b) {
                b *= 2;
            } else if (b >= c) {
                c *= 2;
            } else {
                break;
            }
        }

        System.out.println(a < b && b < c ? "Yes" : "No");
    }
}