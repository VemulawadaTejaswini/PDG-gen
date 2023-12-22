
import java.util.Scanner;

public class Main {
    public static void main(String... args)
    {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        int ascii=(int)c;
        c=(char)(ascii+1);
        System.out.println(c);
    }
}