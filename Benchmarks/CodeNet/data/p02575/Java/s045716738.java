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
        
        SortedMap<Integer, Integer> currToOrigin = new TreeMap<>();
        for (int j = 0; j < W; j++) {
            currToOrigin.put(j, j);
        }
        
        int[] gaps = new int[W];
        gaps[0] = W;
        int minGapIdx = 0;
        
        for (int i = 0; i < H; i++) {
            if (currToOrigin.isEmpty()) {
                System.out.println(-1);
                continue;
            }
            
            SortedMap<Integer, Integer> subMap = currToOrigin.subMap(left[i], right[i]);
            if (!subMap.isEmpty()) {
                int biggestOrigin = subMap.get(subMap.lastKey());
                
                subMap.forEach((curr, orig) -> gaps[curr - orig]--);
                subMap.clear();
                
                if (right[i] < W && !currToOrigin.containsKey(right[i])) {
                    currToOrigin.put(right[i], biggestOrigin);
                    gaps[right[i] - biggestOrigin]++;
                }
            }
            
            while (minGapIdx < W && gaps[minGapIdx] == 0) {
                minGapIdx++;
            }
            System.out.println(minGapIdx < W ? minGapIdx + i + 1 : -1);
        }
    }
}
