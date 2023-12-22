import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ok = true;
        for (int i = 0; i < s.length(); i++) {
            if (((i + 1) % 2 != 0 && s.charAt(i) == 'L') || ((i + 1) % 2 == 0 && s.charAt(i) == 'R')) {
                ok = false;
                break;
            }
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}