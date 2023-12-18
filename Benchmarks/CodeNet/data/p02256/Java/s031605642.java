import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println(147 105);
        // System.out.println(105 % 42);
        // System.out.println(42 % 21);

        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);

        while (true) {
            if (x % y == 0) {
                System.out.println(y);
                break;
            }
            int tmp = x;
            x = y;
            y = tmp % y;
        }
    }
}
