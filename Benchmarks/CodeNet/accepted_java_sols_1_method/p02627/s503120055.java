import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        if (Character.isUpperCase(s.charAt(0))) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}