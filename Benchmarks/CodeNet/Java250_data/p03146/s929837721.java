import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int function(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }
        return 3 * n + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 1000000; i++) {
            if (i == 1) {
                a = s;
                list.add(a);
                continue;
            }
            a = function(a);
            for (int j = 0; j < i - 1; j++) {
                if (a == list.get(j)) {
                    System.out.println(i);
                    return;
                }
            }
            list.add(a);
        }
    }

}
