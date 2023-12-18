

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long first = Long.parseLong(in.nextLine());
        if (first == 1) {
            System.out.println(0);
            return;
        }
        int res = 0;
        final Map<Integer, Integer> divs = new HashMap<>();
        for (int i = 2; i <= Math.sqrt(first); i++) {
            while (first % i == 0) {
                first /= i;
                divs.merge(i, 1, Integer::sum);
            }
        }
        for (int v : divs.values()) {
            int counter = 1;
            while (v - counter >= 0) {
                res++;
                v -= counter++;
            }
        }
        System.out.println(res == 0 ? 1 : res);
    }
}
