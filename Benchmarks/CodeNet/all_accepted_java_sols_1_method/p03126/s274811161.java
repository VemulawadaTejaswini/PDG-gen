import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();

        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            list1.add(a);
        }

        for (int i = 1; i < n; i++) {
            if (list1.isEmpty()) {
                break;
            }
            k = sc.nextInt();
            List<Integer> list2 = new ArrayList<>();

            for (int j = 0; j < k; j++) {
                int a = sc.nextInt();
                if (list1.contains(a))
                    list2.add(a);
            }
            list1 = list2;
            list2 = null;
        }

        System.out.println(list1.size());
    }
}
