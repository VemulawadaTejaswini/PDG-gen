import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] ary = Stream.of(new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int n = ary[0];
        int x = ary[1];
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if (i + j + k == x) {
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);
    }
}