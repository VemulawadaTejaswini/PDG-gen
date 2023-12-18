

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        for (long i = 2; i * i <= first; i++) {
            int counter = 1;
            int c = 2;
            for (int j = 1; first % i == 0; j++) {
                first /= i;
                if (counter == j) {
                    res++;
                    counter += c++;
                }
            }
        }
        System.out.println(res == 0 ? 1 : res);
    }
}
