import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        int[] d = new int[100001];
        for (int i = 0; i < N; i++) {
            d[A[i]] += 1;
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 100000; i++) {
            if (1 < d[i]) {
                for (int j = 0; j < d[i] - 1; j++) {
                    list.add(i);
                }
            }
        }
        int remove = 0;
        while (!list.isEmpty()) {
            list.remove(0);
            if (!list.isEmpty()) {
                list.remove(list.size() - 1);
            }
            remove += 2;
        }
        int answer = N - remove;
        System.out.println(answer);
    }
}
