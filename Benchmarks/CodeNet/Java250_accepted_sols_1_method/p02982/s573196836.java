import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        
        int count = 0;
        for (int h = 0; h < r - 1; h++) {
            for (int i = h + 1; i < r; i++) {
                int tmp = 0;
                for (int j = 0; j < c; j++) {
                    tmp += (int)Math.pow(Math.abs(array[h][j] - array[i][j]), 2);
                }
                
                double tmp2 = Math.sqrt(tmp);
                if (tmp2 == (int)tmp2) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
