import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean flag = true;
        if (!(s.charAt(0) == t.charAt(2))) {
            flag = false;
        }
        if (!(s.charAt(1) == t.charAt(1))) {
            flag = false;
        }
        if (!(s.charAt(2) == t.charAt(0))) {
            flag = false;
        }
        System.out.println(flag ? "YES" : "NO");
    }
}