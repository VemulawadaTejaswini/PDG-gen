
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        Set<Integer> ok = new HashSet<>();
        Set<Integer> ng = new HashSet<>();


        for (int i = 0 ; i < N ; i++) {
            A[i] = scanner.nextInt();
        }

        Arrays.sort(A);
        int max = A[A.length - 1];

        for (int i = 0 ; i < N ; i++) {
            int a = A[i];
            if (ng.contains(a)) {
                if (ok.contains(a)) {
                    ok.remove(a);
                }
                continue;
            }

            ok.add(a);
            
            int b = a;
            while (b <= max) {
                ng.add(b);
                b += a;
            }
        }

        System.out.println(ok.size());

//        boolean[] flag = new boolean[N];
//
//
//        for (int i = 0 ; i < N ; i++) {
//            A[i] = scanner.nextInt();
//            flag[i] = true;
//        }
//
//        Arrays.sort(A);
//
//        for (int i = 0 ; i < N - 1 ; i++) {
//            for (int j = i + 1 ; j < N ; j++) {
//                if (A[i] == A[j]) {
//                    flag[i] = false;
//                }
//
//                if (A[j] % A[i] == 0) {
//                    flag[j] = false;
//                }
//            }
//        }
//
//        int count = 0;
//        for (int i = 0 ; i < N ; i++) {
//            if (flag[i]) count++;
//        }
//
//        System.out.println(count);
    }
}
