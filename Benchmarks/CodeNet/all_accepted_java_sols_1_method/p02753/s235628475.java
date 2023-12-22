import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.next();
            for (int i = 1; i < n.length(); i++) {
                if (n.charAt(i - 1) != n.charAt(i)) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }
    }
}
