import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int Q = sc.nextInt();
        
        // i行目において右方向にひっくり返せなくなった黒い石の数。
        // j列目において下方向にひっくり返せなくなった黒い石の数。
        // 但し黒い石のみに着目するため、座標系は [0, N-2)。
        int[] horizontallyLost = new int[N - 2];
        int[] verticallyLost = new int[N - 2];
        
        // 盤上に残っている黒い石の数。
        long blacks = ((long) N - 2) * (N - 2);
        
        int minHorizontal = N - 2;
        int minVertical = N - 2;
        
        for (int i = 0; i < Q; i++) {
            boolean isVertical = sc.nextInt() == 1;
            int idx = sc.nextInt() - 2;
            
            if (isVertical) {
                int num = N - 2 - verticallyLost[idx];
                blacks -= num;
                
                if (idx < minVertical) {
                    for (int j = 0; j < num; j++) {
                        horizontallyLost[j] = N - 2 - idx;
                    }
                    minVertical = idx;
                }
                
            } else {
                int num = N - 2 - horizontallyLost[idx];
                blacks -= num;
                
                if (idx < minHorizontal) {
                    for (int j = 0; j < num; j++) {
                        verticallyLost[j] = N - 2 - idx;
                    }
                    minHorizontal = idx;
                }
            }
        }
        
        System.out.println(blacks);
    }
}
