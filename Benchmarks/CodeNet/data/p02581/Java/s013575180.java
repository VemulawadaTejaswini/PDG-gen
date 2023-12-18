
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    private static final Set<int[]> patterns = Set.of(
            new int[] { 0, 1, 2, 3, 4 },
            new int[] { 0, 1, 3, 2, 4 },
            new int[] { 0, 1, 4, 2, 3 },
            new int[] { 0, 2, 3, 1, 4 },
            new int[] { 0, 2, 4, 1, 3 },
            new int[] { 0, 3, 4, 1, 2 },
            new int[] { 1, 2, 3, 0, 4 },
            new int[] { 1, 2, 4, 0, 3 },
            new int[] { 1, 3, 4, 0, 2 },
            new int[] { 2, 3, 4, 0, 1 });
    
    private static int[] As;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        As = new int[N * 3];
        for (int i = 0; i < N * 3; i++) {
            As[i] = sc.nextInt();
        }
        
        System.out.println(calc(0, Arrays.copyOf(As, 2)));
    }
    
    private static int calc(int start, int[] left2) {
        if (start + 3 == As.length) {
            return left2[0] == As[start + 2] && left2[1] == As[start + 2] ? 1 : 0;
        }
        
        int[] left5 = new int[] { left2[0], left2[1], As[start + 2], As[start + 3], As[start + 4] };
        
        return patterns.stream().map(p -> {
            int[] l5 = new int[5];
            l5[0] = left5[p[0]];
            l5[1] = left5[p[1]];
            l5[2] = left5[p[2]];
            l5[3] = left5[p[3]];
            l5[4] = left5[p[4]];
            
            Arrays.sort(l5, 0, 3);
            Arrays.sort(l5, 3, 5);
            
            return l5;
        })
                .distinct()
                .parallel()
                .mapToInt(l5 -> {
                    int curr = (l5[0] == l5[1] && l5[0] == l5[2] ? 1 : 0);
                    int next = calc(start + 3, new int[] { l5[3], l5[4] });
                    return curr + next;
                }).max().getAsInt();
    }
}
