
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String s = sc.next();
    static String p = sc.next();

    public static void main(String[] args) {
        String ss = s + s;
        if (ss.contains(p))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
