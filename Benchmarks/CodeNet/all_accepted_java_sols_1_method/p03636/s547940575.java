import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            System.out.println(s.substring(0, 1) + (s.length() - 2) + s.substring(s.length() - 1, s.length()));
        }
    }
}
