import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        String u = sc.next();
        if (s.equals(u)) {
            a--;
        }
        if (t.equals(u)) {
            b--;
        }
        System.out.println(String.format("%s %s", a, b));
        sc.close();
    }
}
