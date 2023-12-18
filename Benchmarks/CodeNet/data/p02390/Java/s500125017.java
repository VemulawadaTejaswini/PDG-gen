import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int s = Integer.parseInt(scanner.next());
        scanner.close();

        final int seconds = s % 60;
        final int minutes = ((s - seconds) / 60) % 60;
        final int hours = (((s - seconds) / 60) - minutes) / 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
