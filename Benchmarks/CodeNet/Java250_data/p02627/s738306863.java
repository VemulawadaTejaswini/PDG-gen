import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        boolean lowercase = !s.equals(s.toLowerCase());
        boolean uppercase = !s.equals(s.toUpperCase());
        if (!lowercase) {
            System.out.println("a");
        }
        if (!uppercase) {
            System.out.println("A");
        }
    }
}