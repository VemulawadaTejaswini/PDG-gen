import static java.lang.System.out;
import java.util.Scanner;


public class Main {
    public static void main(String...args) {

        int S = new Scanner(System.in).nextInt();
        int timer = (60 * 60);
        int h = S / timer;
        int m = S % timer / 60;
        int s = S % timer % 60;
        out.println(h + ":" + m + ":" + s);
    }


}