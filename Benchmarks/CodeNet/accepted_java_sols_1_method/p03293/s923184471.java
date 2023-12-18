import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            String tmp = t.substring(i, t.length()) + t.substring(0, i);
            if (tmp.equals(s)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}