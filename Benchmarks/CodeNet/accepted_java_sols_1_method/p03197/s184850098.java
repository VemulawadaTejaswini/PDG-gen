import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            if (v % 2 == 1) {
                System.out.println("first");
                return;
            }
        }
        System.out.println("second");
    }
}