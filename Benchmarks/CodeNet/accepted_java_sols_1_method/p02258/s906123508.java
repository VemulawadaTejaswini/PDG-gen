
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> rts = new ArrayList<>();
        sc.nextLine();
        while(sc.hasNext()) {
            rts.add(Long.parseLong(sc.nextLine()));
        }
        long maxv = (long)Math.pow(10, 9) * -1;
        long minv = rts.get(0);
        for (int i = 1; i < rts.size(); i++) {
            long rji = rts.get(i) - minv;
            if (rji > maxv) {
                maxv = rji;
            }
            if (rts.get(i) < minv) {
                minv = rts.get(i);
            }
        }
//        for (int i = 0; i < rts.size(); i++) {
//            for (int j = 1; j < rts.size(); j++) {
//                if (i >= j) {
//                    continue;
//                }
//                long v = rts.get(j) - rts.get(i);
//                if (v > maxv) {
//                    maxv = v;
//                }
//            }
//        }
        System.out.println(maxv);
    }
}


