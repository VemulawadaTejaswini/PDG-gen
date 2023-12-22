import java.lang.reflect.Array;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

}
