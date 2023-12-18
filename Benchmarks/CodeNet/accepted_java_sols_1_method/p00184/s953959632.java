import java.util.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == 0)
                break;
            int[] g = new int[7];
            while (n != 0) {
                int age = scan.nextInt();
                if (age >= 60)
                    age = 60;
                g[age / 10]++;

                n--;
            }
            for (int a : g)
                System.out.println(a);
        }
    }
}