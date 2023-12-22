import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(v);
        float tmp = (v[0] + v[1]) / 2f;
        for (int i = 2; i < N; i++) {
            tmp = (tmp + v[i]) / 2f;
        }

        System.out.println(tmp);
    }
}