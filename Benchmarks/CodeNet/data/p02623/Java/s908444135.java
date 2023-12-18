import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long limit = sc.nextLong();

        List<Long> aList = new ArrayList<>();
        List<Long> bList = new ArrayList<>();
        aList.add(0L);
        bList.add(0L);
        for (int i = 1; i <= a; i++) aList.add(sc.nextInt() + aList.get(i-1));
        for (int i = 1; i <= b; i++) bList.add(sc.nextInt() + bList.get(i-1));

        long count = 0;
        int bCount = bList.size()-1;
        for (int i = 0; i <= a; i++) {
            while (true) {
                if (bCount < 0) break;
                if (aList.get(i) + bList.get(bCount) <= limit) {
                    count = Math.max(i+bCount, count);
                    break;
                }
                bCount--;
            }
        }
        System.out.println(count);
    }
}