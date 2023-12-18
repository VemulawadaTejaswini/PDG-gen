import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] res = new int[S.length()];

        char target = 'L';
        int pos = 0;
        int counter = 0;
        for (int i = 0; i < S.length(); i++) {
            if (target != S.charAt(i)) {
                counter++;
                continue;
            }
            if (target == 'L') {
                counter++;
                target = 'R';
                pos = i;
                int tmp = counter / 2;
                res[pos - 1] += tmp;
                res[pos] += counter - tmp;
                counter = 0;
            } else {
                target = 'L';
                int tmp = counter / 2;
                res[pos] += tmp;
                res[pos - 1] += counter - tmp;
                counter = 1;
            }
        }
        int tmp = counter / 2;
        res[pos] += tmp;
        res[pos - 1] += counter - tmp;

        System.out.println(Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")));

    }
}
