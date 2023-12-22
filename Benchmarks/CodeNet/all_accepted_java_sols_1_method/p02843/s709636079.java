import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int xx = x / 100;
        if (100 * xx <= x && x <= 105 * xx) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}