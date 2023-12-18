import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        String s = std.next();
        String t = std.next();
        int a = std.nextInt();
        int b = std.nextInt();
        String u = std.next();

        if (s.equals(u)) {
            a--;
        } else {
            b--;
        }

        System.out.println(a + " " + b);
    }
}
