import java.util.Scanner;

public class Main {

    private static final String FORMAT = "%d:%d:%d";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetSec = scanner.nextInt();

        int sec = targetSec % 60;
        int min = (targetSec / 60) % 60;
        int hour = (targetSec / (60 * 60));
        System.out.println(String.format(FORMAT, hour, min, sec));
    }
}