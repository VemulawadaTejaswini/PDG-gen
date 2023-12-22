import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] V = new int[N];
            for (int i = 0; i < N; i++) {
                V[i] = sc.nextInt();
            }

            Arrays.sort(V);

            BigDecimal d = new BigDecimal(V[0]);
            for (int i = 1; i < N; i++) {
                d = d.add(new BigDecimal(V[i])).divide(new BigDecimal(2));
            }

            System.out.println(d);
        }
    }

}
