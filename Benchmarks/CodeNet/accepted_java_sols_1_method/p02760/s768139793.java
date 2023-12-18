import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] card = new int[3][3];
        boolean[][] bingo = new boolean[3][3];
        for(int i = 0 ; i < 3; i++){
            for(int j = 0; j < 3; j++){
                card[i][j] = sc.nextInt();   
            }
        }
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int b = sc.nextInt();
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    if(b == card[j][k]){
                        bingo[j][k] = true;
                    }
                }
            }
        }
        boolean ans = false;
        for(int i = 0; i < 3; i++){
            if(bingo[0][i] && bingo[1][i] && bingo[2][i] || bingo[i][0] && bingo[i][1] && bingo[i][2]){
                ans = true;
                break;
            }
        }
        if(bingo[0][0] && bingo[1][1] && bingo[2][2] || bingo[2][0] && bingo[1][1] && bingo[0][2]){
            ans = true;
        }
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
