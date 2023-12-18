import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        boolean n = string.contains("N");
        boolean w = string.contains("W");
        boolean s = string.contains("S");
        boolean e = string.contains("E");

        System.out.println(n == s && e == w ? "Yes" : "No");
    }
}