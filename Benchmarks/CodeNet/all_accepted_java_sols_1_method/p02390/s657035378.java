import java.util.Scanner;
public class Main {
    public static void main(String[] defargs) {
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int hour = sec / 3600;
        int min = (sec % 3600) / 60;
         sec = sec % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}

