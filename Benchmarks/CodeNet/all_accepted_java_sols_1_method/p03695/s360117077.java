

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int min = 0;
        List<Integer> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int j = 400;
            while (value >= j && j <= 3200) {
                j += 400;
            }
            if (value < 3200) {
                if (!list.contains(j)) {
                    min++;
                    list.add(j);
                }
            } else {
                list.add(value);
            }
        }
        System.out.println((min == 0 ? 1 : min) + " " + list.size());
    }
}
