import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(sc.nextLong());
        
        if (list.contains(0L)) {
            System.out.println(0);
            return;
        }

        long result = 1;
        long max = (long) Math.pow(10, 18);
        for (int i = 0; i < n; i++) {
            if (max / result >= list.get(i)) {
                result *= list.get(i);
            } else {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(result);
    }
}
