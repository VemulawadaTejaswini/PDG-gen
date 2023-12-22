import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Integer d[] = new Integer[N];
        for (int i = 0; i < N; i++) {
            d[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(d, Comparator.naturalOrder());

        int count = 0;
        for (int i = 0; i < N-1; i++) {
            if (d[i] != d[i+1]) {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
