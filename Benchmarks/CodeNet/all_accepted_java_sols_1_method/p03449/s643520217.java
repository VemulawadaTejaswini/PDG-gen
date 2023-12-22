import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a1.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            a2.add(sc.nextInt());
        }

        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    count += a1.get(j);
                } else if (j == i) {
                    count += a1.get(j);
                    count += a2.get(j);
                } else {
                    count += a2.get(j);
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }

}
