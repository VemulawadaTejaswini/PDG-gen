import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final int K = sc.nextInt();
        
        final boolean[][] field = new boolean[H][W];
        final int[] hBlacks = new int[H];
        final int[] wBlacks = new int[W];
        
        int blacks = 0;
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            
            for (int j = 0; j < W; j++) {
                if (s.charAt(j) == '#') {
                    field[i][j] = true;
                    hBlacks[i]++;
                    wBlacks[j]++;
                    blacks++;
                }
            }
        }
        
        // 総当たり
        int count = 0;
        for (int h = 0; h < (1 << H); h++) {
            final int hh = h;
            int[] is = IntStream.range(0, H).filter(i -> 0 < (1 << i & hh)).toArray();
            int hPaint = IntStream.of(is).map(i -> hBlacks[i]).sum();
            
            for (int w = 0; w < (1 << W); w++) {
                final int ww = w;
                int[] js = IntStream.range(0, W).filter(j -> 0 < (1 << j & ww)).toArray();
                int wPaint = IntStream.of(js).map(j -> wBlacks[j]).sum();
                
                int hwPaint = 0;
                for (int i : is) {
                    for (int j : js) {
                        if (field[i][j]) {
                            hwPaint++;
                        }
                    }
                }
                if (blacks - hPaint - wPaint + hwPaint == K) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
