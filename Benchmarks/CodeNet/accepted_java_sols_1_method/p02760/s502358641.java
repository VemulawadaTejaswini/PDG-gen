import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int min = 999;
        int bingo[][] = new int[5][5];
        boolean masu[][] = new boolean[5][5];
        boolean ans = false;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                bingo[i][j] = scan.nextInt();
                masu[i][j] = false;
                if(bingo[i][j] > max) max = bingo[i][j];
                if(bingo[i][j] < min) min = bingo[i][j];
            }
        }

        int n = scan.nextInt();
        for(int k = 0; k < n; k++){
            int s = scan.nextInt();
            if(min <= s && s <= max){
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        if(bingo[i][j] == s) masu[i][j] = true;
                    }
                }
            }
            else continue;
        }

        scan.close();

        for(int p = 0; p < 3; p++){
            if(masu[p][0] && masu[p][1] && masu[p][2]) ans = true;
            if(masu[0][p] && masu[1][p] && masu[2][p]) ans = true;
        }
        if(masu[0][0] && masu[1][1] && masu[2][2]) ans = true;
        if(masu[0][2] && masu[2][0] && masu[1][1]) ans = true;

        if(ans) System.out.println("Yes");
        else System.out.println("No");

    }
}