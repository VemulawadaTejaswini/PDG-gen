import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];
        for (int i = 0; i < M; i++) {
            L[i] = scanner.nextInt();
            R[i] = scanner.nextInt();
        }
        scanner.close();

        // index start
        int idxStart = 1;

        // index end
        int idxEnd = N;

        for (int i = 0; i < M; i++) {
            int l = L[i];
            int r = R[i];
            if (idxStart < l) {
                idxStart = l;
            }
            if (idxEnd > r) {
                idxEnd = r;
            }
        }

        // result count
        int result = idxEnd - idxStart;
        if (result == 0) {
            result = 1;
        } else if (result < 0) {
            result = 0;
        } else {
            result = result + 1;
        }

        System.out.println(result);

//        System.out.println(System.currentTimeMillis() - startTime);
    }


}
