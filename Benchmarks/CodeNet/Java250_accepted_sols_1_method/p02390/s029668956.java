import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int sec = Integer.parseInt(scanner.nextLine());
        int hour = sec / (60 * 60);
        sec -= hour * 60 * 60;
        int min = sec / 60;
        sec -= min * 60;

        System.out.println(hour + ":" + min + ":" + sec);
    }
}