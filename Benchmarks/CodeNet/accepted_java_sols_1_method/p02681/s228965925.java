import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(t.length() - s.length() == 1 && t.startsWith(s) ? "Yes" : "No");
    }
}