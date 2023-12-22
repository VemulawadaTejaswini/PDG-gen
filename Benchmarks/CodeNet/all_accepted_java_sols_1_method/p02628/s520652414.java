import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(values);
        int allValues = 0;
        for (int i = 0; i < K; i++) {
            allValues += values[i];
        }
        System.out.println(allValues);

    }
}
