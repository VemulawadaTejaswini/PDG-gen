import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.printf("%s %s\n", str.substring(0, 4), str.substring(4));
    }
}