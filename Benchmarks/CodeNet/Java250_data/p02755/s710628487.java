
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < 1100; i++) {
            if (i * 8 / 100 == a && i * 10 / 100 == b) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}