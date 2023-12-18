import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        int count = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b && i * 500 + j * 100 <= x; j++) {
                int tmp = i * 500 + j * 100;
                int rest = x - tmp;
                if (rest >= 0 && rest % 50 == 0 && rest / 50 <= c) count++;
            }
        }

        System.out.println(count);
    }
}