import java.util.*;

public class Main {

    static final int D = 365;
    static final int[] c = new int[27];
    static final int[][] s = new int[365][27];
    static final int[] ans = new int[365];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        for (int i = 1; i <= 26; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < D; i++) {
            for (int j = 1; j <= 26; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < D; i++) {
            int max = 0;
            int idx = 0;
            for (int j = 1; j <= 26; j++) {
                if(max < s[i][j]){
                    max = s[i][j];
                    idx = j;
                }
            }
            ans[i] = idx;
            sb.append(idx + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
