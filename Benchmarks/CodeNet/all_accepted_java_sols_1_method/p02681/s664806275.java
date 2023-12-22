import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        if (s.equals(t.subSequence(0, t.length() - 1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}