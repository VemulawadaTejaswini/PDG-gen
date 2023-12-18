import java.util.*;

public class Main {

    static final int D = 365;
    static final int[] c = new int[27];
    static final int[][] s = new int[365][27];
    static final int[] ans = new int[365];
    static final int[] last = new int[27];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int fla = 0;
        for (int i = 1; i <= 26; i++) {
            c[i] = sc.nextInt();
            fla += c[i];
        }
        for (int i = 0; i < D; i++) {
            for (int j = 1; j <= 26; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        StringBuilder sb = new StringBuilder();
        int score = 0;
        for (int i = 0; i < D; i++) {
            score -= fla;
            int max = score;
            int idx = 0;
            for (int j = 1; j <= 26; j++) {
                int tmp = score + s[i][j] +  c[j] *(i - last[j] + 1);
                if(max < tmp){
                    max = tmp;
                    idx = j;
                }
            }
            score = max;
            ans[i] = idx;
            last[idx] = i+1;
            sb.append(idx + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
