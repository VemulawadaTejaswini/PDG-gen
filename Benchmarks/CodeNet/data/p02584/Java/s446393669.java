import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        long x = Long.parseLong(sn.next());
        long k = Long.parseLong(sn.next());
        long d = Long.parseLong(sn.next());
        long c = 0;

        if (k % 2 == 0){
            d = d * 2;
        }

        if ( x > d) {
            c = x - d;
        } else {
            c = d - x;
        }
        System.out.println(c);
    }
}
