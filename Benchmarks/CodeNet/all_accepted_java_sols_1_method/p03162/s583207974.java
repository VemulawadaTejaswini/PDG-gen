import java.util.Scanner;

/**
 *
 * @author beris
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a, b, c, a1 = 0, b1 = 0, c1 = 0, a2 = 0, b2 = 0, c2 = 0;
        for(int i=0;i<n;i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            a1 = a + Math.max(b2, c2);
            b1 = b + Math.max(a2, c2);
            c1 = c + Math.max(a2, b2);
            a2 = a1; b2 = b1; c2 = c1;
        }
        System.out.println(Math.max(a1, Math.max(b1, c1)));
    }
}
