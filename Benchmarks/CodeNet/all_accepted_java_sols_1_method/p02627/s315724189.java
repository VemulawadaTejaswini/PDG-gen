import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.nextLine().charAt(0);
        if (Character.isUpperCase(c))
            System.out.println("A");
        else
            System.out.println("a");
    }
}