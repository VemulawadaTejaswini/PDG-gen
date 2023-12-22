import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        if (x <= 500 * n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}