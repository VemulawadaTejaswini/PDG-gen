import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int s = stdIn.nextInt();

        int hours = s / 3600;
        int minutes = (s / 60) % 60;
        int seconds = s % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}