import java.util.ArrayList;
import java.util.Scanner;

//atcoderはScannerクラスのsc.next()で行ける
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        long ans1;
        long ans2;

        int n = sc.nextInt();
        ArrayList<long[]> dists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long tmp = sc.nextLong();
            long tmp1 = sc.nextLong();
            dists.add(new long[]{tmp, tmp1});
            for (long[] array : dists){
                max = Long.max(max,zettaiti(array[0]-tmp)+zettaiti(array[1]-tmp1));
            }
        }
        System.out.println(max);
    }

    public static long zettaiti(long a) {
        return a >= 0 ? a : a * -1;
    }
}