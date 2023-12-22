import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        for (int i = 0 ; i < s.length() ; i++) {
            String u = s.substring(i, s.length()) + s.substring(0, i);
            if (u.equals(t)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

}
