import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        System.out.println(s.substring(0,k-1) + Character.toLowerCase(s.charAt(k-1)) + s.substring(k));
    }
}
