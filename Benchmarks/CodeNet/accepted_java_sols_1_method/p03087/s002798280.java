
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        final int count = sc.nextInt();
        sc.nextLine();
        final String line = sc.nextLine();
        int[] accumulate = new int[line.length()];
        char[] charArray = line.toCharArray();

        int index = 0;
        while (index < line.length()) {
            int from = index;
            index = line.indexOf("AC", index);
            if (index != -1) {
                Arrays.fill(accumulate, from, index + 2, from == 0 ? 0 : accumulate[from - 1]);
                accumulate[index + 1] = from == 0 ? 1 : (accumulate[from - 1] + 1);
                index += 2;
            } else {
                Arrays.fill(accumulate, from, accumulate.length, from == 0 ? 0 : accumulate[from - 1]);
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            final int from = sc.nextInt() - 1;
            final int to = sc.nextInt() - 1;
            int result = accumulate[to] - accumulate[from];
            System.out.println(result);
        }

    }
}
