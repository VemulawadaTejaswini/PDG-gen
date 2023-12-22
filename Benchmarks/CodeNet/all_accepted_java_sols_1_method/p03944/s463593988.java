import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[][] array = new int[w+1][h+1];
        
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int type = sc.nextInt();
            
            if (type == 1) {
                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= x; j++) {
                        array[j][i] = 1;
                    }
                }
            } else if (type == 2) {
                for (int i = 1; i <= h; i++) {
                    for (int j = x+1; j <= w; j++) {
                        array[j][i] = 1;
                    }
                }
            } else if (type == 3) {
                for (int i = 1; i <= w; i++) {
                    for (int j = 1; j <= y; j++) {
                        array[i][j] = 1;
                    }
                }
            } else {
                for (int i = 1; i <= w; i++) {
                    for (int j = y+1; j <= h; j++) {
                        array[i][j] = 1;
                    }
                }
            }
        }
        
        int count = 0;
        for (int i = 1; i <= w; i++) {
                // System.out.println(Arrays.toString(array[i]));
            for (int j = 1; j <= h; j++) {
                if (array[i][j] == 1) count++;
            }
        }
        
        System.out.println(h * w - count);
    }
}
