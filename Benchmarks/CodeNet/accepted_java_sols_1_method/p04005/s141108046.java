import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] abc = new long[3];
        abc[0] = sc.nextLong();
        abc[1] = sc.nextLong();
        abc[2] = sc.nextLong();
        Arrays.sort(abc);
        long l = abc[2] - abc[2] / 2;
        long s = abc[2] / 2;
        System.out.println((l - s) * abc[0] * abc[1]);
    }

}
