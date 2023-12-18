import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (s.equals(t.substring(0, t.length() - 1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}