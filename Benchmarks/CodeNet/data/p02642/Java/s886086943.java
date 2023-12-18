import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] A = new Integer[N];

        boolean flg = true;
        A[0] = scanner.nextInt();
        for(int i = 1; i < N; i++) {
            A[i] = scanner.nextInt();
            if(A[i-1] != A[i]) flg = false;
        }
        if(flg) {
            System.out.println(0);
            return;
        }
        Arrays.sort(A, Collections.reverseOrder());
        int sum = 1;
        for(int i = 0; i < N-1; i++) {
            boolean f = true;
            for(int j = i + 1; j < N; j++) {
                if(A[i] % A[j] == 0) {
                    f = false;
                    break;
                }
            }
            if(f) sum++;
        }

        System.out.println(sum);
    }
}