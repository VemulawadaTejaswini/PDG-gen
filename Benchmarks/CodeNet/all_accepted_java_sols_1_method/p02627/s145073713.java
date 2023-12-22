import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char n = scanner.next().charAt(0);
        if (Character.isUpperCase(n)) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}