import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
    
    private static class Point {
        private int origin;
        private int current;
        
        private Point(int i) {
            this.origin = i;
            this.current = i;
        }
        
        private int gap() {
            return current - origin;
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
        
        Set<Point> ps = IntStream.range(0, W).mapToObj(Point::new)
                .collect(HashSet::new, Set::add, Set::addAll);
        
        for (int i = 0; i < H; i++) {
            if (ps.isEmpty()) {
                System.out.println(-1);
                continue;
            }
            
            int left = cannotDown[i][0];
            int right = cannotDown[i][1];
            Set<Point> conflicts = new HashSet<>();
            Iterator<Point> itr = ps.iterator();
            int maxOrigin = -1;
            int minGap = Integer.MAX_VALUE;
            
            while (itr.hasNext()) {
                Point p = itr.next();
                
                if (left <= p.current && p.current <= right) {
                    if (right == W - 1) {
                        itr.remove();
                        continue;
                    }
                    
                    p.current = right + 1;
                    conflicts.add(p);
                    if (maxOrigin < p.origin) {
                        maxOrigin = p.origin;
                    }
                }
                if (p.gap() < minGap) {
                    minGap = p.gap();
                }
            }
            
            if (2 <= conflicts.size()) {
                for (Point p : conflicts) {
                    if (p.origin != maxOrigin) {
                        ps.remove(p);
                    }
                }
            }
            
            if (ps.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(minGap == Integer.MAX_VALUE ? -1 : minGap + i + 1);
            }
        }
    }
}
