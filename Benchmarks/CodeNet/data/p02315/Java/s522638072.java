import java.io.*;
import java.util.Scanner;

public class Main{
    public static int max(int a, int b){
        if(a < b){
            return b;
        }else{
            return a;
        }
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int W = scan.nextInt();
        
        int we[] = new int[1001];
        int va[] = new int[1001];
        for(int i = 1; i < N+1; i++){
            we[i] = scan.nextInt();
            va[i] = scan.nextInt();
        }
        
        int ans[][] = new int[101][10001];
        for(int i = 0; i < W+1; i++){
            ans[0][i] = 0;
        }
        
        for(int i = 1; i < N+1; i++){
            for(int j = 0; j < W+1; j++){
                if(we[i] > j){
                    ans[i][j] = ans[i-1][j];
                }else{
                    ans[i][j] = max(ans[i-1][j], ans[i-1][j-we[i]]+va[i]);
                }
            }
        }
        
        System.out.println(ans[N][W]);
    }
}