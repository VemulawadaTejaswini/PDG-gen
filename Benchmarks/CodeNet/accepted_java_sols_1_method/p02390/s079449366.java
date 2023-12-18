import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();

        int hour = s / (60 * 60);
        int min = (s - (hour * 60 * 60)) / 60;
        int sec = s - (min * 60) - (hour * 60 * 60);

        System.out.println(hour + ":" + min + ":" + sec);
    }
}



