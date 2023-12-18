import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int Q = sc.nextInt();
        
        // i行目において右方向にひっくり返せる黒い石の数。
        // 但し黒い石のみに着目するため、座標系は [0, N-2)。
        int[] horizontallyAvailables = new int[N - 2];
        Arrays.fill(horizontallyAvailables, N - 2);
        
        // j列目において下方向にひっくり返せる黒い石の数。
        // 但し黒い石のみに着目するため、座標系は [0, N-2)。
        int[] verticallyAvailables = new int[N - 2];
        Arrays.fill(verticallyAvailables, N - 2);
        
        // 盤上に残っている黒い石の数。
        long blacks = ((long) N - 2) * (N - 2);
        
        for (int i = 0; i < Q; i++) {
            boolean isVertical = sc.nextInt() == 1;
            int idx = sc.nextInt() - 2;
            
            if (isVertical) {
                int num = verticallyAvailables[idx];
                blacks -= num;
                for (int j = 0; j < num; j++) {
                    if (idx < horizontallyAvailables[j]) {
                        horizontallyAvailables[j] = idx;
                    }
                }
                
            } else {
                int num = horizontallyAvailables[idx];
                blacks -= num;
                for (int j = 0; j < num; j++) {
                    if (idx < verticallyAvailables[j]) {
                        verticallyAvailables[j] = idx;
                    }
                }
            }
        }
        
        System.out.println(blacks);
    }
}
