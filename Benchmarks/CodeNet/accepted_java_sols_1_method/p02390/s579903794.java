import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int h = s / 60 / 60;
        int m = (s - h * 60 * 60) / 60;
        s = s % 60;

        System.out.println(h + ":" + m + ":" + s);
    }
}
