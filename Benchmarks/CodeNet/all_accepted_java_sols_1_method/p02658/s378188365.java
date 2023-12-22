import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("input.txt"));

        int n = in.nextInt();
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("1000000000000000000");
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextLong();
        }
        Arrays.sort(nums);

        if (nums[0] == 0) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < n; i++) {
            b = b.multiply(new BigInteger(String.valueOf(nums[i])));

            if (b.compareTo(c) > 0) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(b.toString());
    }
}
