import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int hours = sec / 3600;
        int minutes = (sec - hours * 3600) / 60;
        int seconds = (sec - hours * 3600) % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}