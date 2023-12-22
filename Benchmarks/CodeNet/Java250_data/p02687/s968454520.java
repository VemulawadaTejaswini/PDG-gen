import java.util.*;

public class Main {
  public static void main(String[] args) {
    final String ABC_STR = "ABC";
        final String ARC_STR = "ARC";
        Scanner s = new Scanner(System.in);
        final String S = s.nextLine();

        if (ABC_STR.equals(S)) {
            System.out.println(ARC_STR);
        } else {
            System.out.println(ABC_STR);
        }
  }
}