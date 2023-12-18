import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] ab = new long[2];
        ab[0] = sc.nextLong();
        ab[1] = sc.nextLong();
        Arrays.sort(ab);
        if (ab[0] >= 2) {
            System.out.println((ab[0] - 2) * (ab[1] - 2));
            return;
        }
        if (ab[1] == 1) {
            System.out.println(1);
        } else {
            System.out.println(ab[1] - ab[0] - 1);
        }
    }

}
