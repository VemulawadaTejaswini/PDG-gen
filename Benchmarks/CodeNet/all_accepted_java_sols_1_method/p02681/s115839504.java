import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        final String S = s.nextLine();
        final String T = s.nextLine();

        if (S.equals(T.substring(0, T.length() - 1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}