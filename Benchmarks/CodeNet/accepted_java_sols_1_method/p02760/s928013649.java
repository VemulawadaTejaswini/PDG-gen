import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] bingo = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                bingo[i][j] = sc.nextInt();
            }
        }
        
        int N = sc.nextInt();
        
        for(int k = 0; k < N; k++) {
            int b = sc.nextInt();
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(bingo[i][j] == b) {
                        bingo[i][j] = 0;
                    }
                }
            }
        }
        
        boolean ans = false;
        
        for(int i = 0; i < 3; i++) {
            if(bingo[0][i] == 0 && bingo[1][i] == 0 && bingo[2][i] == 0) {
                ans = true;
            }
            if(bingo[i][0] == 0 && bingo[i][1] == 0 && bingo[i][2] == 0) {
                ans = true;
            }
        }
        
        if(bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0 || bingo[0][2] == 0 && bingo[1][1] == 0 && bingo[2][0] == 0) {
            ans = true;
        }
            
        if(ans) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
        
    }
}