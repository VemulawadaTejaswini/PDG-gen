import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final Long H = Long.parseLong(sc.next());
        final Long W = Long.parseLong(sc.next());
        long ans;
        if (H == 1 || W == 1) {
            ans = 1;
        } else if ((H * W) % 2 == 0) {
            ans = (H * W) / 2;
        } else {
            ans = ((H * W) / 2) + 1;
        }
        out.println(ans);

        out.flush();
    }
}
