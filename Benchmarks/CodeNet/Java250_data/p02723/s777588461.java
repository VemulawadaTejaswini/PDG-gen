import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        if (string.charAt(0) != string.charAt(1) && string.charAt(2) == string.charAt(3) && string.charAt(4) == string.charAt(5))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}