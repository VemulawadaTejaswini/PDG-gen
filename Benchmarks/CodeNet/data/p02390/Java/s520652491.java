import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int seconds = inp.nextInt();

        int minuets = seconds / 60;

        seconds -= (minuets * 60);


        int hours = minuets / 60;

        minuets -= (hours * 60);

        System.out.println(hours + ":" + minuets + ":" + seconds);
    }
}
