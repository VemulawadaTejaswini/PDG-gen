import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created on 2017/10/25 7:07.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                if (set.contains(A)) {
                    set.remove(A);
                } else {
                    set.add(A);
                }
            }
            System.out.println(set.size());
        }
    }
}