import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] A = new char[H][W];
        for(int i = 0; i < H; i++){
            String S = sc.next();
            for(int j = 0; j < W; j++)
                A[i][j] = S.charAt(j);
        }
        sc.close();
        int right = 0;
        int down = 0;

        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(A[i][j] == '#'){
                    if(j != W-1){
                        if(A[i][j+1] == '#')
                            right++;
                    }
                    if(i != H-1){
                        if(A[i+1][j] == '#')
                            down++;
                    }
                }
            }
        }
        if(right == W-1 && down == H-1){
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}