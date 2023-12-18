import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    System.out.println(a.charAt(i) > b.charAt(i) ? "GREATER" : "LESS");
                    return;
                }
            }
            System.out.println("EQUAL");
        } else {
            System.out.println(a.length() > b.length() ? "GREATER" : "LESS");
        }
    }
}
