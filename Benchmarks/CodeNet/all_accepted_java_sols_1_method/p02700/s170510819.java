import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        while (true) {
            c -= b;
            if (c <= 0) {
                System.out.println("Yes");
                break;
            }
            a -= d;
            if (a <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}