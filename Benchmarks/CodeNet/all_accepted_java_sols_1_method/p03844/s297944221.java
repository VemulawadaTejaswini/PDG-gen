import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        String s = sc.next();
        long b = Long.parseLong(sc.next());
        if (s.equals("+")) {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }
    }
}