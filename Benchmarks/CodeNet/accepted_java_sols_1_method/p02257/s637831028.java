import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            boolean pn = true;
            if (x == 1) {
                pn = false;
            }
            for (int j = 2; j <= Math.sqrt(x); j++) {
                if (x % j == 0) {
                    pn = false;
                    break;
                }
            }
            if (pn) {
                count++;
            }
        }
        System.out.println(count);
    }
}
