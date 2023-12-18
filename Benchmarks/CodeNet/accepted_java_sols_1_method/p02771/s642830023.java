import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        if(a == b) {
            System.out.println((b != c) ? "Yes" : "No");
        } else if(b == c) {
            System.out.println((c != a) ? "Yes" : "No");
        } else if(c == a) {
            System.out.println((a != b) ? "Yes" : "No");
        } else {
            System.out.println("No");
        }
    }
}
