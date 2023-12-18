import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main
{
    public static void main(String... args)
    {
        final Scanner scanner = new Scanner(System.in);
        final int in = scanner.nextInt();
        final long h = TimeUnit.SECONDS.toHours(in);
        final long m = TimeUnit.SECONDS.toMinutes(in) - TimeUnit.HOURS.toMinutes(h);
        final long s = TimeUnit.SECONDS.toSeconds(in) - TimeUnit.HOURS.toSeconds(h) - TimeUnit.MINUTES.toSeconds(m);
        System.out.println(String.format("%d:%d:%d", h, m, s));
    }
}