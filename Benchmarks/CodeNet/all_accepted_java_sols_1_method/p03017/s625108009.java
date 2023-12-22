import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;
        int d = sc.nextInt() - 1;
        String s = sc.next();
        boolean goaled = false;
        for (;;) {
            if (a == c && b == d) {
                goaled = true;
                break;
            }
            if (a + 1 <= c && a + 1 != b && s.charAt(a + 1) == '.') {
                a++;
            } else if (a + 2 <= c && a + 2 != b && s.charAt(a + 2) == '.') {
                a+=2;
            } else if (b + 1 <= d && (a < b || a == c) && s.charAt(b + 1) == '.') {
                b++;
            } else if (b + 2 <= d && (a < b || a == c) && s.charAt(b + 2) == '.') {
                b+=2;
            } else {
                break;
            }
        }
        System.out.println(goaled ? "Yes" : "No");
    }
}
