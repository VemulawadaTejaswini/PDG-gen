import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            String ptn = scn.next();
            int cnt = 0;
            for(int n = scn.nextInt(); n > 0; n--) {
                String ring = scn.next();
                if(ring.concat(ring).indexOf(ptn) != -1) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}