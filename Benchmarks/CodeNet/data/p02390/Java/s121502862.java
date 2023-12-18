
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        if (a.nextInt() >= 0 && a.nextInt() < 86400){
            int sec = a.nextInt();
            int hours = sec / 3600;
            int minutes = (sec % 3600) / 60;
            int second = (sec % 3600) % 60;

            System.out.println(hours + ":" + minutes + ":" + second);
        }else{
            System.out.println("No");
        }
    }
}