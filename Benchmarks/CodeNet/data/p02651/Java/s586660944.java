import java.util.Arrays;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        long T = scan.nextLong();
        for (long ii = 0; ii < T; ii++) {
            int N = scan.nextInt();
            long A[] = new long[N];

            for (int i = 0; i < N; i++) {
                A[i] = scan.nextLong();
            }
            String S = scan.next();
            int P0 = 0;
            int P1 = 0;
            for (int i = 0; i < N; i++) {
                if (S.substring(i, i + 1).equals("0")) {
                    P0++;
                } else {
                    P1++;
                }
            }
            int N0[] = new int[P0];
            int N1[] = new int[P1];
            int p = 0;
            int q = 0;

            for (int i = 0; i < N; i++) {
                if (S.substring(i, i + 1).equals("0")) {
                    N0[p] = i;
                    p++;
                } else {
                    N1[q] = i;
                    q++;
                }
            }

            int P = 0;

            for (int i = 0; i < 1 << P0 &&P==0; i++) {
                int Y=0;

                long PP0=0;

                for (int j = 0; j < P0; j++) {
                    // 1loop毎にどの参考書を買うかの判定(j冊目を買うかどうか)

                    if ((1 & i >> j) == 1) {PP0=PP0^A[N0[j]];

                        // ここに引っかかった = 買う対象に追加(j冊目購入)
                    }

                }
                for (int iii = 0; iii< 1 << P1; iii++) {
long PP1=0;

                    for (int jjj = 0; jjj < P1; jjj++) {
                        // 1loop毎にどの参考書を買うかの判定(j冊目を買うかどうか)

                        if ((1 & iii >> jjj) == 1) {PP1=PP1^A[N1[jjj]];

                            // ここに引っかかった = 買う対象に追加(j冊目購入)
                        }
                    }
long X=PP0^PP1;

                    if (X == 0) {Y=1;
                    }


                }
                if (Y==0){P=1;}
            }






            System.out.println(P);
        }
    }


}

