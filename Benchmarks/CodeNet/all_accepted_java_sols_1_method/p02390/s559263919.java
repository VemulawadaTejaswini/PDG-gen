import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSecond = sc.nextInt();
        int hour = inputSecond / 3600;
        int minute = (inputSecond % 3600) / 60;
        int second = (inputSecond % 3600) % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
