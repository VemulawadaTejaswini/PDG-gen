import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int v = 7;
        for (int i = 1; i <= k; i++) {
            v %= k;
            if (v == 0) {
                System.out.println(i);
                return;
            }
            v *= 10;
            v += 7;
        }
        System.out.println(-1);
    }
}