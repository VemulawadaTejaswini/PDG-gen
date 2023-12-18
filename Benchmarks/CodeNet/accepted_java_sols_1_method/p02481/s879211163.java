import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int width = scan.nextInt();
        System.out.printf(
                "%d %d\n",
                height * width,
                (2 * height) + (2 * width));
    }
}