import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    int M;
    int T;
    int P;
    int R;
    int[][] ps;
    int[] ss;
    int[] as;

    void run() {
        while (true) {
            M = sc.nextInt();
            T = sc.nextInt();
            P = sc.nextInt();
            R = sc.nextInt();
            if ((M | T | P | R) == 0) {
                break;
            }

            ps = new int[T + 1][P + 1]; // penaruty count
            ss = new int[T + 1]; // keikazikan
            as = new int[T + 1];

            Integer[] nums = new Integer[T];
            for (int i = 0; i < T; i++) {
                nums[i] = i + 1;
            }

            for (int i = 0; i < R; i++) {
                int m = sc.nextInt();
                int t = sc.nextInt();
                int p = sc.nextInt();
                int j = sc.nextInt();

                if (j == 0) {
                    ss[t] += m + ps[t][p] * 20;
                    as[t]++;
                } else {
                    ps[t][p] += 1;
                }
            }

            Arrays.sort(nums, new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    if (as[a] != as[b]) {
                        return as[b] - as[a];
                    } else if (ss[a] != ss[b]) {
                        return ss[a] - ss[b];
                    } else {
                        return b - a;
                    }
                }
            });

            int idx = 0;
            boolean init = true;
            while (true) {
                if (init) {
                    init = false;
                    System.out.print(nums[idx]);
                    if (idx + 1 >= T) {
                        break;
                    }
                    if (as[nums[idx]] == as[nums[idx + 1]]
                            && ss[nums[idx]] == ss[nums[idx + 1]]) {

                        System.out.print("=");
                    } else {
                        System.out.print(",");
                    }
                } else {
                    System.out.print(nums[idx]);
                    if (idx + 1 >= T) {
                        break;
                    } else {
                        if (as[nums[idx]] == as[nums[idx + 1]]
                                && ss[nums[idx]] == ss[nums[idx + 1]]) {

                            System.out.print("=");
                        } else {
                            System.out.print(",");
                        }
                    }
                }
                idx++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}