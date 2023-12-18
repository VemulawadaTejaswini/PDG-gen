import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int[] input = new int[n];
            int[] output = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = sc.nextInt();
            }
            int loopCount = 0;
            while (true) {
                for (int i = 0; i < n; i++) {
                    int count = 0;
                    for (int j = 0; j < n; j++) {
                        if (input[i] == input[j]) {
                            count++;
                        }
                    }
                    output[i] = count;
                }
                if (isSame(input, output)) {
                    break;
                }
                loopCount++;
                input = output.clone();
                Arrays.fill(output,0);
            }
            System.out.println(loopCount);
            for (int i = 0; i < output.length; i++) {
                System.out.print(output[i]);
                if (i == output.length - 1) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    static boolean isSame(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
