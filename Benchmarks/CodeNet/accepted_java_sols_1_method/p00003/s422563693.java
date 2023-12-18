import java.util.*;

public class Main
{
    public static void main(String... args)
    {
        final Scanner scanner = new Scanner(System.in);
        final int set = scanner.nextInt();
        for (int i = 0; i < set; i++) {
            final List<Integer> integers = Arrays.asList(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            Collections.sort(integers);
            final double a = Math.pow(integers.get(0), 2);
            final double b = Math.pow(integers.get(1), 2);
            final double c = Math.pow(integers.get(2), 2);
            System.out.println(c == a + b ? "YES" : "NO");
        }
    }
}