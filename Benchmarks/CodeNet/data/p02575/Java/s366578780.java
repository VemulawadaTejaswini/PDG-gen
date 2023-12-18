import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    
    private static class Move {
        private final int origin;
        private final int current;
        private final int gap;
        
        private Move(int i) {
            this.origin = i;
            this.current = i;
            this.gap = 0;
        }
        
        private Move(int origin, int current) {
            this.origin = origin;
            this.current = current;
            this.gap = current - origin;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        
        final int[][] cannotDown = new int[H][2];
        
        for (int i = 0; i < H; i++) {
            cannotDown[i][0] = sc.nextInt() - 1;
            cannotDown[i][1] = sc.nextInt() - 1;
        }
        
        TreeSet<Move> byCurrent = new TreeSet<>((m1, m2) -> m1.current != m2.current
                ? Integer.compare(m1.current, m2.current)
                : Integer.compare(m1.origin, m2.origin));
        TreeSet<Move> byGap = new TreeSet<>((m1, m2) -> m1.gap != m2.gap
                ? Integer.compare(m1.gap, m2.gap)
                : Integer.compare(m1.origin, m2.origin));
        for (int j = 0; j < W; j++) {
            Move m = new Move(j);
            byCurrent.add(m);
            byGap.add(m);
        }
        
        for (int i = 0; i < H; i++) {
            if (byCurrent.isEmpty()) {
                System.out.println(-1);
                continue;
            }
            
            int left = cannotDown[i][0];
            int right = cannotDown[i][1];
            
            SortedSet<Move> subset = byCurrent.subSet(new Move(0, left), new Move(W, right));
            
            if (!subset.isEmpty()) {
                Set<Move> subset2 = Set.copyOf(subset);
                Move edge1 = subset.last();
                byCurrent.removeAll(subset2);
                byGap.removeAll(subset2);
                
                if (right < W - 1) {
                    SortedSet<Move> tmp = byCurrent.subSet(new Move(0, right + 1), new Move(W, right + 1));
                    
                    if (tmp.isEmpty()) {
                        Move moved = new Move(edge1.origin, right + 1);
                        byCurrent.add(moved);
                        byGap.add(moved);
                    }
                }
            }
            
            if (byCurrent.isEmpty()) {
                System.out.println(-1);
            } else {
                Move minGap = byGap.first();
                System.out.println(minGap.gap + i + 1);
            }
        }
    }
}
