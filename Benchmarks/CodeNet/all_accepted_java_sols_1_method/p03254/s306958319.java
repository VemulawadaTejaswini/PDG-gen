import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long x = sc.nextInt();

        List<Long> demandList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            demandList.add(sc.nextLong());
        }
        Collections.sort(demandList);

        long sum = 0;
        long childCount = 0;
        for (long demand : demandList) {
            sum += demand;
            if (sum > x) {
                break;
            }
            childCount++;
        }
        if (sum < x && childCount != 0) {
            childCount--;
        }

        System.out.println(childCount);

    }
}
