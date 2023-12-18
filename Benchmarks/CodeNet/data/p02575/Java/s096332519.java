import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        
        final int[] left = new int[H];
        final int[] right = new int[H];
        
        for (int i = 0; i < H; i++) {
            left[i] = sc.nextInt() - 1;
            right[i] = sc.nextInt();
        }
        
        SortedMap<Integer, Integer> currToGap = new TreeMap<>();
        for (int j = 0; j < W; j++) {
            currToGap.put(j, 0);
        }
        
        int[] gaps = new int[W];
        gaps[0] = W;
        int minGapIdx = 0;
        int maxGapIdx = 0;
        
        int i = 0;
        for (; i < H && !currToGap.isEmpty(); i++) {
            SortedMap<Integer, Integer> subMap = currToGap.subMap(left[i], right[i]);
            if (!subMap.isEmpty()) {
                int maxCurr = subMap.lastKey();
                int minGap = subMap.get(maxCurr);
                
                subMap.values().forEach(gap -> gaps[gap]--);
                subMap.clear();
                
                if (right[i] < W && !currToGap.containsKey(right[i])) {
                    int newGap = minGap + right[i] - maxCurr;
                    currToGap.put(right[i], newGap);
                    gaps[newGap]++;
                    if (maxGapIdx < newGap) {
                        maxGapIdx = newGap;
                    }
                }
                
                while (minGapIdx <= maxGapIdx && gaps[minGapIdx] == 0) {
                    minGapIdx++;
                }
            }
            System.out.println(minGapIdx <= maxGapIdx ? minGapIdx + i + 1 : -1);
        }
        for (; i < H; i++) {
            System.out.println(-1);
        }
    }
}
