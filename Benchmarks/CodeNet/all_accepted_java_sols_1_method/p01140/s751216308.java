import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (h == 0 && w == 0) {
                break;
            }
            int[] hCounts = new int[h * 1000 + 1];
            int[] hSums = new int[h + 1];
            for (int i = 1; i <= h; i++) {
                hSums[i] = hSums[i - 1] + sc.nextInt();
                for (int j = 0; j < i; j++) {
                    hCounts[hSums[i] - hSums[j]]++;
                }
            }
            int[] wCounts = new int[w * 1000 + 1];
            int[] wSums = new int[w + 1];
            for (int i = 1; i <= w; i++) {
                wSums[i] = wSums[i - 1] + sc.nextInt();
                for (int j = 0; j < i; j++) {
                    wCounts[wSums[i] - wSums[j]]++;
                }
            }
            long count = 0;
            for (int i = 1; i < hCounts.length && i < wCounts.length; i++) {
                count += hCounts[i] * wCounts[i];
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}

