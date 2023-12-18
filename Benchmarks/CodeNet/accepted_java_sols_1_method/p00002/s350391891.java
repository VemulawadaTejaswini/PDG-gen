import java.util.Scanner;

public class Main
{
    public static void main(String... args)
    {
        final Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            System.out.println(Integer.toString(a + b).length());
        }
    }
}