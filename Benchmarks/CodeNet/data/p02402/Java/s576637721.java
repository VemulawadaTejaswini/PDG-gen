import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = sc.nextInt();
        int sum = a;
        int min = a;
        int max = a;

        while (--n > 0) {
            a = sc.nextInt();
            sum += a;
            if (a < min)
                min = a;
            else if (a > max)
                max = a;
        }
        System.out.printf("%d %d %d\n", min, max, sum);
    }
}