import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long a, b, c, d;
        double n = Math.sqrt(s);
        long intNum = (int)Math.ceil(n);
        long diff = (intNum * intNum) - s;
        a = intNum;
        b = 1;
        c = diff;
        d = intNum;
        if(diff == 0) {
            b = 0;
            c = 0;
        }
        System.out.println("0 0 " + a + " " + b + " " + c + " " + d);
    }
}
