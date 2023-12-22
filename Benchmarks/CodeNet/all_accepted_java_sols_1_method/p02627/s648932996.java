import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";

        String alpha = scanner.nextLine();

        if(uppercase.contains(alpha))
            System.out.println("A");
        else
            System.out.println("a");
    }
}
