
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int S = sc.nextInt();

    public static void main(String[] args) {
        int hour = S / 3600;
        int min = (S % 3600) / 60;
        int sec = (S % 3600) % 60;
        System.out.println(hour + ":" + min + ":" + sec);

    }
}
