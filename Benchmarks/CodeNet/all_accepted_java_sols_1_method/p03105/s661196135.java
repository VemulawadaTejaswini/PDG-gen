import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int count = 0;
        while (b >= a) {
            b -= a;
            count++;

            if (count >= c) break;
        }

        System.out.println(count);
    }
}
