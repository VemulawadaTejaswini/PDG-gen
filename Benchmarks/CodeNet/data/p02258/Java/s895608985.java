import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> rts = new ArrayList<>();
        while(sc.hasNext()) {
            rts.add(Long.parseLong(sc.nextLine()));
        }
        int nmin = 0;
        for (int i = 1; i < rts.size(); i++) {
            if (rts.get(nmin) > rts.get(i)) {
                nmin = i;
            }
        }
        int nmax = nmin + 1;
        for (int i = nmax + 1; i < rts.size(); i++) {
            if (rts.get(nmax) < rts.get(i)) {
                nmax = i;
            }
        }
        System.out.println(rts.get(nmax) - rts.get(nmin));
    }
}


