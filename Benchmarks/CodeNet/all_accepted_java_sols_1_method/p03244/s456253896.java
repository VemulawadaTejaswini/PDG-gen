import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = in.nextInt();
            }

            HashSet<Integer> numberSet = new HashSet<>();
            int[] count = new int[100001];
            for (int i = 0; i < n; i += 2) {
                count[v[i]]++;
                numberSet.add(v[i]);
            }
            HashSet<Integer> numberSet2 = new HashSet<>();
            int[] count2 = new int[100001];
            for (int i = 1; i < n; i += 2) {
                count2[v[i]]++;
                numberSet2.add(v[i]);
            }

            int max = (int) 0;
            int maxV = (int) -1e9;
            int maxS = (int) 0;
            int maxSV = (int) -1e9;
            for (Integer integer : numberSet) {
                if (count[integer.intValue()] > max) {
                    maxS = max;
                    maxSV = maxV;
                    max = count[integer.intValue()];
                    maxV = integer.intValue();
                } else if (count[integer.intValue()] > maxS) {
                    maxS = count[integer.intValue()];
                    maxSV = integer.intValue();
                }
            }

            int max2 = (int) 0;
            int maxV2 = (int) -1e9;
            int maxS2 = (int) 0;
            int maxSV2 = (int) -1e9;
            for (Integer integer : numberSet2) {
                if (count2[integer.intValue()] > max2) {
                    maxS2 = max2;
                    maxSV2 = maxV2;
                    max2 = count2[integer.intValue()];
                    maxV2 = integer.intValue();
                } else if (count2[integer.intValue()] > maxS2) {
                    maxS2 = count2[integer.intValue()];
                    maxSV2 = integer.intValue();
                }
            }

            if (n == 2) {
                if (v[0] == v[1]) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                return;
            }

            int count3 = 0;
            if (maxV != maxV2) {
                count3 += n / 2 - max;
                count3 += n / 2 - max2;
            } else {
                count3 = Math.min(n / 2 - max + n / 2 - maxS2, n / 2 - maxS + n / 2 - max2);
            }
            System.out.println(count3);

        }
    }
}
