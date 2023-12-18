import java.util.*;
public class Main {
    public static void main(String[]args){
        // 標準入力
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // 9*9の答えの格納
        int [][]answers = new int[10][10];
        
        for (int i=1;i < 10;i++){

            for (int j = 1; j<10 ;j++){
              
                answers [i][j] = i * j;
            }
        }
        
        boolean flg = false;
        
        for (int i=1;i < 10;i++){
            
            for (int j = 1;j<10;j++){
                
                // 該当するものがあれば処理を終了し答えを出力
                if (N == answers[i][j]){
                    flg = true;
                    System.out.println("Yes");
                    break;
                } 
            }
            if (flg) break;

        }
        
        if (!flg){
            System.out.println("No");
        }
    }   
       
}       