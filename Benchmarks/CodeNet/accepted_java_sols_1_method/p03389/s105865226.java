import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int[] abc = new int[] { A, B, C };
            Arrays.sort(abc);
            int count = 0;
            count += abc[2] - abc[1];
            abc[0] += count;
            abc[1] += count;
//            Utils.debug(abc);
            int c2 = (abc[2] - abc[0]) / 2 + (abc[2] - abc[0]) % 2;
            count += c2;
            abc[0] += 2 * c2;
//            Utils.debug(abc);
            if (abc[0] > abc[2]) {
                count++;
                abc[1]++;
                abc[2]++;
            }
//            Utils.debug(abc);
            System.out.println(count);
        }
    }
}
