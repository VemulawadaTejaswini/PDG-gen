import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        long Y = sc.nextLong();

        int result = 0;

        for (;;) {
            X = X * 2;
            result++;
            if (X > Y) {
                break;
            }
        }
        System.out.println(result);
    }
}