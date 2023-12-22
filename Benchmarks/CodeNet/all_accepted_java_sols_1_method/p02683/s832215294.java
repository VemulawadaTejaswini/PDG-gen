import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int[] Cz = new int[N];
        int[][] Az = new int [N][M];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M + 1; j++) {
                if (j == 0){
                    Cz[i] = sc.nextInt();
                } else {
                    Az[i][j - 1] = sc.nextInt();
                }
            }
        }
        HashSet<Integer> set = new HashSet<Integer>();
        int[] sums = new int[M];
        int cannot_flg = 0;
        int inf = 1000000000;
        int min_money = inf;
        int val = 0;
        for (int i = 0; i < (2<<N-1); i++){
            sums = new int[M];
            set = new HashSet<Integer>();
            for (int j = 0; j < N; j++) {
                cannot_flg = 0;
                if ((1 & i >> j) == 1) {
                    set.add(j);
                }
            }
//            System.out.println("i: "+i+" set: "+set);
            for (int k: set){
                for (int m = 0; m < M; m++){
                    sums[m] += Az[k][m];
                }
            }

            for (int m = 0; m < M; m++){
//                System.out.println("sums[m] "+sums[m]);
                if (sums[m] < X){
                    cannot_flg = 1;
                    break;
                }
            }

            if (cannot_flg == 0){
                val = 0;
                for (int n: set){
//                    System.out.println("Cz[n]: "+Cz[n]);
                    val += Cz[n];
                }

                if (val < min_money) min_money = val;
            }
//            }
        }

        if (min_money == inf) min_money = -1;
        System.out.println(min_money);
//        System.out.println(N);
//        System.out.println(Math.pow(2,N));
//        System.out.println(2<<N-1);
//        System.out.println(2<<N);
    }
}
