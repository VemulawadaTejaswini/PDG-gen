import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            if (s.charAt(0) == s.charAt(1)) {
                if (s.charAt(2)!=s.charAt(0) && s.charAt(2) == s.charAt(3)) {
                    System.out.println("Yes");
                    return;
                }
            } else if (s.charAt(0) == s.charAt(2)) {
                if (s.charAt(1)!=s.charAt(0) && s.charAt(1) == s.charAt(3)) {
                    System.out.println("Yes");
                    return;
                }
            } else if (s.charAt(0) == s.charAt(3)) {
                if (s.charAt(1)!=s.charAt(0) && s.charAt(1) == s.charAt(2)) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }
    }
}
