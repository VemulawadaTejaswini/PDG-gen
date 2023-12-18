import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int x = 0;
        int y = 0;
        x = ((n+a-1) / a) * b;
        y = ((n+c-1) / c) * d;
        if (x >= y) {
            System.out.println(y);
        } else {
            System.out.println(x);
        }
    }
}
