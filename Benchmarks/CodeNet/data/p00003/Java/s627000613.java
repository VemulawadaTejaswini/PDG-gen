import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            if (a > b && a > c && a*a == b*b + c*c) {
                System.out.println("YES");
            } else if (b > a && b > c && b*b == a*a + c*c) {
                System.out.println("YES");
            } else if (c > a && c > b && c*c == a*a + b*b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}