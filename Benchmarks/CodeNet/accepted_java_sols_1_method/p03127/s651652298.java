import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        Long minNum = 0L;
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
            if (i == 0 || a.get(i) < minNum) {
                minNum = a.get(i);
            }
        }

        while (true) {
            Long minReminder = null;
            for (int i = 0; i < n; i++) {
                Long reminder = a.get(i) % minNum;
                if (reminder == 0) {
                    continue;
                }
                if (minReminder == null || reminder < minReminder) {
                    minReminder = reminder;
                }
            }
            if (minReminder == null) {
                break;
            }
            minNum = minReminder;
        }
        System.out.println(minNum);
    }

}
