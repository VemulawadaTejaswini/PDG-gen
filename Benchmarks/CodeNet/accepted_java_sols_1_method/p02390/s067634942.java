import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int in = scanner.nextInt();

        int h = in / (60 * 60);
        int m = Math.max(0, in - h * 60 * 60) / 60;
        int s = Math.max(0, in - h * 60 * 60 - m * 60);

        System.out.println(h + ":" + m + ":" + s);
    }
}
