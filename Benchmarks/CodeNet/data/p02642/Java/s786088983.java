

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] A = new long[n];

        for (int i = 0; i < n; i ++ ) {
            A[i] = sc.nextLong();
        }

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i ++ ) {
            for (int j = 0; j < n; j ++ ) {
                if (i != j && (A[i] % A[j] == 0)) {
                    list.add(A[i]);
                    break;
                }
            }
        }

        System.out.println(n - list.size());


    }
}

