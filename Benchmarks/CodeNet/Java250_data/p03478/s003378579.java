import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main
{
    private static InputStream debugInput() {
        String s = "20 2 5";
        return new ByteArrayInputStream(s.getBytes());
    }

    private static InputStream stdin() {
        return System.in;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(stdin());
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            int x = i;
            int sum = 0;
            while (x > 0) {
                sum += (x % 10);
                x /= 10;
            }

            if (sum >= a && sum <= b) {

                total += i;
            }
        }

        System.out.println(total);
   }
}
