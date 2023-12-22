import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        int[][] cake = new int[H][W];
        int num  = 0;
        for (int i = 0; i < H; i++) {
            boolean found = false;
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                if (s.charAt(j) == '#') {
                    cake[i][j] = ++num;
                    if (!found) {
                        for (int k = j; k >=0; k--) {
                            cake[i][k] = num;
                        }
                        found = true;
                    }
                } else {
                    if (found) {
                        cake[i][j] = num;
                    }
                }
            }
        }
        for (int i = 1; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (cake[i][j] == 0) {
                    cake[i][j] = cake[i-1][j];
                }
            }
        }
        for (int i = H-2; i >= 0; i--) {
            for (int j = 0; j < W; j++) {
                if (cake[i][j] == 0) {
                    cake[i][j] = cake[i+1][j];
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                ans.append(cake[i][j]).append(" ");
            }
            ans.append("\n");
        }
        System.out.print(ans);
    }
}

