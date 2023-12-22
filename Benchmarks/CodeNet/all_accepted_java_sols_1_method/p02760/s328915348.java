import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        boolean[][] b = new boolean[3][3];
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if(a[j][k] == c) b[j][k] = true;
                }
            }
        }
        boolean ans = false;
        for (int i = 0; i < 3; i++) {
            if(b[i][0] && b[i][1] && b[i][2]){
                ans = true; break;
            }
            if(b[0][i] && b[1][i] && b[2][i]){
                ans = true; break;
            }
        }
        if(b[0][0] && b[1][1] && b[2][2]) ans = true;
        if(b[2][0] && b[1][1] && b[0][2]) ans = true;
        System.out.println(ans ? "Yes" : "No");
        sc.close();

    }

}
