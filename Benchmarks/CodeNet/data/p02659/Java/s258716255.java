import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Long a = Long.parseLong(sc.next());
        double b = Double.parseDouble(sc.next());
        if(a > 10000) {
            long ans = (long)(b * 10000.000);
            System.out.println((long)((double)a/10000.000*ans));
        }else {
            System.out.println((long)(a*b));
        }
    }
}
