import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        String s = std.next();
        int center = n / 2;
        String left = s.substring(0, center);
        String right = s.substring(center);
        if (left.equals(right)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}