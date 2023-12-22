import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int a = std.nextInt();
        int b = std.nextInt();
        int c = std.nextInt();
        int diff = a - b;
        int rest = c - diff;
        if (rest < 0) {
            rest = 0;
        }

        System.out.println(rest);
    }
}
