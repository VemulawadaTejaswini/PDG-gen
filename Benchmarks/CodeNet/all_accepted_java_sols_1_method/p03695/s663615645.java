import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userCount = sc.nextInt();

        List<Integer> totals = new ArrayList<>();
        for (int i = 0; i < userCount; i++) {
            totals.add(sc.nextInt());
        }

        int overBuyer = 0;
        int[] count = new int[8];
        for (int j = 0; j < totals.size(); j++) {
            int total = totals.get(j);
            if (total <= 399) {
                count[0]++;
            } else if (total <= 799) {
                count[1]++;
            } else if (total <= 1199) {
                count[2]++;
            } else if (total <= 1599) {
                count[3]++;
            } else if (total <= 1999) {
                count[4]++;
            } else if (total <= 2399) {
                count[5]++;
            } else if (total <= 2799) {
                count[6]++;
            } else if (total <= 3199) {
                count[7]++;
            } else if (3200 <= total) {
                overBuyer++;
            }
        }

        int min = 0;
        int max = 0;
        int exist = 0;
        for (int c = 0; c < count.length; c++) {
            if (count[c] != 0) {
                exist++;
            }
        }
        max = exist + overBuyer;
        if (exist != 0) {
            min = exist;
        } else {
            min = 1;
        }

        System.out.println(min + " " + max);
    }
}