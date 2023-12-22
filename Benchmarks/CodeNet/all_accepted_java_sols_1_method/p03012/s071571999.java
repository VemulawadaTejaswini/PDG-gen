import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> W = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            W.add(scanner.nextInt());
        }
        scanner.close();

        int min = Integer.MAX_VALUE;

        // max
        int max = 0;
        for (int n : W) {
            max += n;
        }

        int s1 = 0;
        int s2 = max;

        for (int i = 0; i < N; i++) {
            s1 += W.get(i);
            s2 -= W.get(i);
            int calc = s2 - s1;
            calc = (calc >= 0) ? calc : -calc;
            if (min > calc) {
                min = calc;
            } else {
                break;
            }
        }

        System.out.println(min);

//        System.out.println(System.currentTimeMillis() - startTime);
    }

}
