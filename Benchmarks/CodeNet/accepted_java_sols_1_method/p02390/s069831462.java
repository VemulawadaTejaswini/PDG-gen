import java.util.Scanner;

/**
 * Created by khrom on 2017/06/11.
 */
public class Main {
    public static void main(String[] args) {
        int time = new Scanner(System.in).nextInt();
        int hour = time / (60 * 60);
        int minute = (time - hour * 60 * 60) / 60;
        int second = (time - hour * 60 * 60 - minute * 60);
        System.out.println(hour + ":" + minute + ":" + second);
    }
}