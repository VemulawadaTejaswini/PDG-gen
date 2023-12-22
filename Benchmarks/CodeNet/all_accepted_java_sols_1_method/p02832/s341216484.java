import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N;
        int[] a;

        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        a = new int[N];
        a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        int num = 1;
        for (int i = 1; i <= N; i++) {
            if (a[i - 1] != num) {
                count++;
            } else {
                num++;
            }
        }

        if (num == 1) {
            count = -1;
        }
        System.out.println(count);
    }
}
