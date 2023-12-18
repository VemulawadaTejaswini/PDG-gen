import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] alpha = new int[26];
        Arrays.fill(alpha, 50);

        IntStream.range(0, Integer.parseInt(sc.next())).forEach(i -> {
            String str = sc.next();
            IntStream.rangeClosed('a', 'z').forEach(j ->
                    alpha[j - 'a'] = (int) Math.min(alpha[j - 'a'], str.chars().filter(k -> k == j).count())
            );
        });

        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < alpha[i - 'a']; j++) {
                System.out.print(i);
            }
        }
    }
}