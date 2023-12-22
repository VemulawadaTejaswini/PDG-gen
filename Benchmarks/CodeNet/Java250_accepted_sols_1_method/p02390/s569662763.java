import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int hour = (int)Math.ceil(x / 3600);
        int minutes = (int)Math.ceil((x - hour * 3600 ) / 60);
        int second = (x - hour * 3600 - minutes * 60);

        System.out.println(hour + ":" + minutes + ":" +second);
    }

}