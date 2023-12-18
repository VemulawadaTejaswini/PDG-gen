import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int h = 0;
        int m = 0;
        int s = 0;
        if(time >= 60*60) {
            h = time/(60*60);
            time -= 60*60*h;
        }
        if(time >= 60) {
            m = time/60;
            time -= 60*m;
        }
        s = time%60;

        out.println(String.format("%d:%d:%d", h, m, s));
    }
}

