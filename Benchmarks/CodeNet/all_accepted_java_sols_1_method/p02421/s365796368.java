import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = 0, h = 0, lim = scn.nextInt();
        for(int i = 0; i < lim; i++) {
            int val = scn.next().compareTo(scn.next());
            if(val > 0) {
                t += 3;
            } else if(val < 0) {
                h += 3;
            } else {
                t++;
                h++;
            }
        }
        System.out.println(t + " " + h);
    }
}