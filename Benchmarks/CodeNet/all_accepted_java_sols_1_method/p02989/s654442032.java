import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dlist = new int[N];

        for (int i = 0; i < N; i++) {
            dlist[i] = sc.nextInt();
        }

        Arrays.sort(dlist);
        int cntpp = N / 2;
        int cntpm = N / 2 - 1;

        if (dlist[cntpm] == dlist[cntpp]) {
            System.out.println(0);
        } else {
            System.out.println(dlist[cntpp] - dlist[cntpm]);
        }

    }
}
