import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp <= a)
                x += 1;
            else if (temp <= b)
                y += 1;
            else
                z += 1;
        }

        System.out.println(Math.min(Math.min(x, y), z));
        sc.close();
    }
}