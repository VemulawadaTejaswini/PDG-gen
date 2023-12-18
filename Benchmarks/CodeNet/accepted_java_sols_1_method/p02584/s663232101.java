import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        if(x < 0) {
            x = -x;
        }
        long k = sc.nextLong();
        long d = sc.nextLong();
        long div = x / d;
        if(k <= div) {
            System.out.println(x - k * d);
            return;
        }
        k -= div;
        x -= d * div;
        if(k % 2 == 0) {
            System.out.println(x);
        } else {
            System.out.println(d-x);
        }

    }


}