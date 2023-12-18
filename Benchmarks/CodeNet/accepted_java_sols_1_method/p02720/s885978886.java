import java.util.Scanner;

public class Main {
    static final int ZERO = 1;
    static final int NINE = 10;

    int[][] DP = new int[30][12];

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        if(K < 10){
            System.out.println(K);
            return;
        }

        for (int i = ZERO; i <= NINE; i++) {
            DP[0][i] = 1;
        }

        K -= 9;

        int D = 1;
        while(true){
            for (int n=ZERO;n<=NINE;n++){
                DP[D][n] = DP[D-1][n-1] + DP[D-1][n] + DP[D-1][n+1];

                if(n == ZERO) continue;

                if(K-DP[D][n] <= 0){
                    System.out.print(n-ZERO);
                    D--;

                    int tempN = n;
                    while(D >= 0){
                        for(int i = -1;i <= 1;i++){
                            if(K - DP[D][tempN+i] > 0){
                                K -= DP[D][tempN+i];
                            } else {
                                System.out.print(tempN+i-ZERO);
                                tempN = tempN+i;
                                break;
                            }
                        }
                        D--;
                    }

                    System.out.println("");
                    return;
                }

                K -= DP[D][n];
            }
            D++;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
