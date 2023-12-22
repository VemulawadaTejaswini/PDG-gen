import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        int[][] n = new int[player][3];
        int[][] flag = new int[player][3];

        int[] score = new int[player];
        int cnt = 0;
        int buf = 0;
        for(int i = 0;i < player;i++){
            for(int j = 0;j < 3;j++){
                n[i][j] = sc.nextInt();
                flag[i][j] = 1;
            }
        }
        for(int i = 0;i < player;i++){
            for(int j = 0;j < 3;j++){
                for(int k = i+1;k < player;k++){
                    if(n[i][j] == n[k][j]){
                        flag[i][j] = 0;
                        flag[k][j] = 0;
                    }
                }
            }
        }
        for(int i = 0;i < player;i++){
            for(int j = 0;j < 3;j++){
                score[i] += n[i][j] * flag[i][j];
            }
            System.out.println(score[i]);            
        }
    }
}