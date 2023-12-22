import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] ary = new int[r+1][c+1];
        for (int i = 0;i < r;i++) {
            for (int j = 0;j < c;j++) {
                ary[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0;i < c;i++) {
            for (int j = 0;j < r;j++) ary[r][i] += ary[j][i];
        }

        for (int i = 0;i < r;i++) {
            for (int j = 0;j < c;j++) ary[i][c] += ary[i][j];
        }
        
        for (int i = 0;i < r;i++) ary[r][c] += ary[i][c];
        
        for (int i = 0;i < r+1;i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0;j < c+1;j++) {
                sb.append(ary[i][j]).append(" ");
            }
            System.out.println(sb.substring(0, sb.length()-1));
        }
    }
}

