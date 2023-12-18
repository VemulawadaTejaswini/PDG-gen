import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        int seconds = value % 60;
        int minutes = (value / 60) % 60;
        int hours = value / 3600;

        System.out.println(hours + ":" + minutes + ":" + seconds);
        scanner.close();
    }
}

