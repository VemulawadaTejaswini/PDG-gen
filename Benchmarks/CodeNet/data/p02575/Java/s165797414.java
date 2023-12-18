import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        
        final int[][] range = new int[H][2];
        
        for (int i = 0; i < H; i++) {
            range[i][0] = sc.nextInt() - 1;
            range[i][1] = sc.nextInt();
        }
        
        SortedMap<Integer, Integer> currToOrigin = new TreeMap<>();
        for (int j = 0; j < W; j++) {
            currToOrigin.put(j, j);
        }
        
        int[] gaps = new int[W];
        gaps[0] = W;
        int minGapIdx = 0;
        int maxGapIdx = 0;
        
        StringBuilder result = new StringBuilder();
        final String BR = System.lineSeparator();
        
        int i = 0;
        for (; i < H && !currToOrigin.isEmpty(); i++) {
            int left = range[i][0];
            int right = range[i][1];
            SortedMap<Integer, Integer> subMap = currToOrigin.subMap(left, right);
            
            if (!subMap.isEmpty()) {
                int biggestOrigin = subMap.get(subMap.lastKey());
                
                subMap.forEach((curr, orig) -> gaps[curr - orig]--);
                subMap.clear();
                
                if (right < W && !currToOrigin.containsKey(right)) {
                    currToOrigin.put(right, biggestOrigin);
                    gaps[right - biggestOrigin]++;
                    if (maxGapIdx < right - biggestOrigin) {
                        maxGapIdx = right - biggestOrigin;
                    }
                }
                
                while (minGapIdx <= maxGapIdx && gaps[minGapIdx] == 0) {
                    minGapIdx++;
                }
            }
            result.append(minGapIdx <= maxGapIdx ? minGapIdx + i + 1 : -1).append(BR);
        }
        for (; i < H; i++) {
            result.append(-1).append(BR);
        }
        System.out.println(result);
    }
}
