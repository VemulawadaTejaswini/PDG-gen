import java.util.*;
import java.math.*;
class Main {
    //
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] bingo = new int[3][3];
        for(int i = 0; i < 3;i++){
            for(int j = 0;j < 3;j++){
                bingo[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int[] ary = new int[n];
        for(int i = 0;i < n;i++){
            int tmp = sc.nextInt();
            for(int j = 0;j < 3;j++){
                for(int k = 0;k < 3;k++){
                    if(bingo[j][k] == tmp)bingo[j][k] = 0;
                }
            }
        }
        for(int i = 0;i < 3;i++){
            if(bingo[i][0] == bingo[i][1]&&bingo[i][1] == bingo[i][2]){
                System.out.println("Yes");
                return;
            }
            if(bingo[0][i]==bingo[1][i]&&bingo[1][i]==bingo[2][i]){
                System.out.println("Yes");
                return;
            }
        }
        if(bingo[0][0]==bingo[1][1]&&bingo[1][1]==bingo[2][2]){
            System.out.println("Yes");
            return;
        }
        if(bingo[0][2]==bingo[1][1]&&bingo[1][1]==bingo[2][0]){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
        
    }
}
