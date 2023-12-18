import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n=sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] minN = new int[n];
            int[] maxN = new int[n];
            for (int i=0;i<n;i++) {
                maxN[i] = minN[i] = sc.nextInt();
            }
            int maxS = 0, minS = 0;
            int min,max;
            int index;

            while(true) {
                index = -1;
                max = 0;
                for (int i = 0; i < n - maxS - 1; i++) {
                    if (Math.abs(maxN[i] - maxN[i + 1]) > 1) {
                        continue;
                    }
                    if (maxN[i] * maxN[i + 1] > max) {
                        max = maxN[i] * maxN[i + 1];
                        index = i;
                    }
                }
                if (index == -1) {
                    break;
                }
                for (int i = index; i < n - maxS - 2; i++) {
                    maxN[i] = maxN[i + 2];
                }
                maxS += 2;
            }

            while(true) {
                index = -1;
                min = 1000001;
                for (int i = 0; i < n - minS - 1; i++) {
                    if (Math.abs(minN[i] - minN[i + 1]) > 1) {
                        continue;
                    }
                    if (minN[i] * minN[i + 1] < min) {
                        min = minN[i] * minN[i + 1];
                        index = i;
                    }
                }
                if (index == -1) {
                    break;
                }
                for (int i = index; i < n - minS - 2; i++) {
                    minN[i] = minN[i + 2];
                }
                minS += 2;
            }
            System.out.println(minS>maxS?minS:maxS);
        }
    }
}