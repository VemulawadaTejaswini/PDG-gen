
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {
    
    private static class Target {
        private final int h;
        private final int w;
        
        private Target(int h, int w) {
            this.h = h;
            this.w = w;
        }
        
        @Override
        public boolean equals(Object o) {
            if (o instanceof Target) {
                Target t = (Target) o;
                return h == t.h && w == t.w;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(h, w);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final int M = sc.nextInt();
        
        int[] hCount = new int[H];
        int[] wCount = new int[W];
        
        Set<Target> targets = new HashSet<>();
        for (int i = 0; i < M; i++) {
            int h = sc.nextInt() - 1;
            int w = sc.nextInt() - 1;
            hCount[h]++;
            wCount[w]++;
            targets.add(new Target(h, w));
        }
        
        int hMaxCount = IntStream.of(hCount).max().getAsInt();
        int wMaxCount = IntStream.of(wCount).max().getAsInt();
        Set<Integer> maxHs = new HashSet<>();
        Set<Integer> maxWs = new HashSet<>();
        for (int h = 0; h < H; h++) {
            if (hCount[h] == hMaxCount) {
                maxHs.add(h);
            }
        }
        for (int w = 0; w < W; w++) {
            if (wCount[w] == wMaxCount) {
                maxWs.add(w);
            }
        }
        
        boolean exists = maxHs.stream().flatMap(h -> maxWs.stream().map(w -> new Target(h, w)))
                .filter(Predicate.not(targets::contains))
                .findAny().isPresent();
        
        System.out.println(exists ? hMaxCount + wMaxCount : hMaxCount + wMaxCount - 1);
    }
}
