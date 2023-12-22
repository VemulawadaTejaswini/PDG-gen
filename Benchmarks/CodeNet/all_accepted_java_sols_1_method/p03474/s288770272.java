import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        if (s.charAt(a) != '-') {
            System.out.println("No");
            System.exit(0);
        }
        for (int i = 0; i < a; i++) {
            if (Character.isDigit(s.charAt(i)))
                ;
            else {
                System.out.println("No");
                System.exit(0);
            }
        }
        for (int i = a + 1; i < a + b + 1; i++) {
            if (Character.isDigit(s.charAt(i)))
                ;
            else {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}