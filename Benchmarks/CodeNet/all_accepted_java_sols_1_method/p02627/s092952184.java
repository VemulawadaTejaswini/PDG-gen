import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        if (Pattern.matches("^[A-Z]+$", n)) {
            System.out.println("A");
        }else {
            System.out.println("a");
        }
    }
}
