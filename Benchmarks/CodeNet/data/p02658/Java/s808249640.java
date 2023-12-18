import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long value = sc.nextLong();
            if (value == 0) {
                System.out.println("0");
                return;
            } else {
                list.add(value);
            }

        }
        try {
            long x = (long) Math.pow(10, 18);
            long result = 1;
            for (long num : list) {
                if (num > x) {
                    break;
                } else {
                    result = result * num;
                }
            }
            if (result > x) {
                System.out.println("-1");
            } else {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("-1");
        }
    }
}
