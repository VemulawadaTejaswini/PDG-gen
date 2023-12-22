import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int[] lengths = new int[n];
        for (int i = 0; i < n; i++) {
            lengths[i] = sc.nextInt();
        }
        
        int[][] table = new int[r][c];
        int k = 1;
        int l = 0;
        
        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    table[i][j] = k;
                    l++;
                    if (l == lengths[k - 1]) {
                        k++;
                        l = 0;
                    }
                }
            } else {
                for (int j = c - 1; j >= 0; j--) {
                    table[i][j] = k;
                    l++;
                    if (l == lengths[k - 1]) {
                        k++;
                        l = 0;
                    }
                }
            }
        }
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(table[i][j]);
                if (j != c - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println("");
                }
            }
        }
    }
}
