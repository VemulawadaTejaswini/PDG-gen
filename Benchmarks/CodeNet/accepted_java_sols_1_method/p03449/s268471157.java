import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        sc.close();

        int[] Cum1 = new int[N + 1];
        int[] Cum2 = new int[N + 1];

        Cum1[0] = 0;
        Cum2[0] = 0;

        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 0; i < N; i++) {
            tmp1 += Integer.parseInt(line1[i]);
            tmp2 += Integer.parseInt(line2[i]);
            Cum1[i + 1] = tmp1;
            Cum2[i + 1] = tmp2;
        }

        int max = 0;
        for (int j = 1; j < N; j++) {
            int line2val = Cum2[N] - Cum2[j - 1];
            int val = Cum1[j] + line2val;
            if (val >= max) {
                max = val;
            }
        }

        if (max == 0) {
            max = Integer.parseInt(line1[0]) + Integer.parseInt(line2[0]);
        }

        System.out.println(max);
    }

}