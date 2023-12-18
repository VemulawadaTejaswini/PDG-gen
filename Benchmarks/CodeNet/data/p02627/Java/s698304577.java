import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        if (Character.isLowerCase(c))
            System.out.println('A');
        else
            System.out.println("a");


    }
}
