import java.util.*;

public class Main {

    public static void main(String[] args) {
        int [][][] A = new int [3][3][2];
        Scanner stdIn = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j][0] = stdIn.nextInt();
                A[i][j][1] = 0;
            }
        }
        int N = stdIn.nextInt();
        int [] b = new int [N];
        for (int k = 0; k < N; k++) {
            b[k] = stdIn.nextInt();
        }
        stdIn.close();

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (b[k] == A[i][j][0]) {
                        A[i][j][1]++;
                    }
                }
            }
        }

        int bingo = 0;
        for (int i = 0; i < 3; i++) {
            if (A[i][0][1] == 1 && A[i][1][1] == 1 && A[i][2][1] == 1) {
                bingo++;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (A[0][j][1] == 1 && A[1][j][1] == 1 && A[2][j][1] == 1) {
                bingo++;
            }
        }
        if ((A[0][0][1] == 1 && A[1][1][1] == 1 && A[2][2][1] == 1) || (A[0][2][1] == 1 && A[1][1][1] == 1 && A[2][0][1] == 1)){
            bingo++;
        } 

        if (bingo > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}