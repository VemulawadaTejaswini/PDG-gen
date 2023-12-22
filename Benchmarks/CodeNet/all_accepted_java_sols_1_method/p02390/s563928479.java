import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        int hour = x / 3600;
        int min = x % 3600 / 60;
        int sec = x % 60;

        System.out.println(hour + ":" + min + ":" + sec);
        System.exit(0);
    }
}

