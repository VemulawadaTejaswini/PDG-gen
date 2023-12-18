import java.util.*;
import static java.lang.System.*;
 
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (sc.hasNext()) {
            int arrive = 0;
            for (int i=0; i<3; i++) {
                if (i==0) arrive += sc.nextInt()*3600;
                else if (i==1) arrive += sc.nextInt()*60;
                else if (i==2) arrive += sc.nextInt();
            }
            int leave = 0;
            for (int i=0; i<3; i++) {
                if (i==0) leave += sc.nextInt()*3600;
                else if (i==1) leave += sc.nextInt()*60;
                else if (i==2) leave += sc.nextInt();
            }
             
            int time = leave - arrive;
            int h = time/3600;
            time %= 3600;
            int m = time/60;
            time %= 60;
            int s = time;
             
            out.println(h+" "+m+" "+s);
        }
    }
}
