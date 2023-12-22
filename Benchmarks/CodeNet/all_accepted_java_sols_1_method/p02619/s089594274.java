import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int D = scanner.nextInt();

        int[] C = new int[26];
        for (int i = 0; i < C.length; i++) {
            C[i]=scanner.nextInt();
        }

        int[][] S = new int[D][26];
        for (int i = 0; i < S.length; i++) {//days
            for (int j = 0; j <S[i].length ; j++) {//type
                S[i][j]=scanner.nextInt();
            }
        }

//        int[] T = new int[D];

        int[] L = new int[26];//last day
        Arrays.fill(L,-1);

        int ans =0;
        for (int i = 0; i < D; i++) {
            int t = scanner.nextInt()-1;//type

            ans += S[i][t]; //satisfy
            L[t]=i;

            for (int j = 0; j < 26; j++) {
                int dd  = i- L[j];
                ans -= C[j]  * dd;
            }
            System.out.println(ans);
        }
    }

}
