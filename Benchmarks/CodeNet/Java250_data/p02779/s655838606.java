import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] values = new long[N];
        for(int i = 0; i < N; i++) {
            values[i] = scanner.nextLong();
        }
        Arrays.sort(values);
        for(int i = 0; i < values.length - 1; i++) {
            if(values[i] == values[i + 1]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
