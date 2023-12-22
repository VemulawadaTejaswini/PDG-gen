import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        
        long w = 0;
        if(a > b) {
            w = a;
            a = b;
            b = w;
        }
        
        long k = a;
        boolean hantei = false;
        while(true) {
            if((b - a) %  2 != 0) {
                break;
            }
            if(k - a == b - k || k - a == k - b) {
                hantei = true;
                break;
            }
            k++;
        }
        
        if(hantei) {
            System.out.println(k);
        }else {
            System.out.println("IMPOSSIBLE");
        }
        
    }
}