import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        Boolean[][] Bingo = new Boolean[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Bingo[i][j] = false;
            }
        }

        int N = sc.nextInt();
        int tmp;
        for (int i = 0; i < N; i++) {
            tmp = sc.nextInt();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if(A[j][k] == tmp){
                        Bingo[j][k] = true;
                    }
                }
            }
        }

        String ans = "No";

        for (int i = 0; i < 3; i++) {
            Boolean flag = true;
            for (int j = 0; j < 3; j++) {
                if(Bingo[i][j] == false){
                    flag = false;
                }
            }
            if(flag == true) ans = "Yes";
        }

        for (int i = 0; i < 3; i++) {
            Boolean flag = true;
            for (int j = 0; j < 3; j++) {
                if(Bingo[j][i] == false){
                    flag = false;
                }
            }
            if(flag == true) ans = "Yes";
        }

        if(Bingo[0][0] && Bingo[1][1] && Bingo[2][2]) ans = "Yes";
        if(Bingo[0][2] && Bingo[1][1] && Bingo[2][0]) ans = "Yes";

        System.out.println(ans);

    }
}
