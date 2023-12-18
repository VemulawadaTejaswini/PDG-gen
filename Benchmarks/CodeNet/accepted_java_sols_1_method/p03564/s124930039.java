import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (num < k) {
                num *= 2;
            } else {
                num += k;
            }
        }
        System.out.println(num);
    }
}