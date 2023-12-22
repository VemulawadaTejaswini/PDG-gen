import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String [] S = new String [H];
        int [] [] ans = new int [H] [W];
        
        for(int i=0; i<H; i++){
            S[i] = sc.next();
        }
        
        for(int i =0; i<H; i++){
            for(int j=0; j<W; j++){
            if(S[i].charAt(j) == '#'){
                ans[i][j] = -1;
            }else{
                    if(i > 0 && S[i-1].charAt(j) == '#') ans[i][j]++;
                    if(i < H-1 && S[i+1].charAt(j) == '#') ans[i][j]++;
                    if(j > 0 && S[i].charAt(j-1) == '#') ans[i][j]++;
                    if(j < W-1 && S[i].charAt(j+1) == '#') ans[i][j]++;
                    if(i > 0 && j > 0 && S[i-1].charAt(j-1) == '#') ans[i][j]++;
                    if(i < H-1 && j < W-1 && S[i+1].charAt(j+1) == '#') ans[i][j]++;
                    if(i < H-1 && j > 0 && S[i+1].charAt(j-1) == '#') ans[i][j]++;
                    if(i > 0 && j < W-1 && S[i-1].charAt(j+1) == '#') ans[i][j]++;
            }
            }
        }
        
        for(int i =0; i<H; i++){
            for(int j=0; j<W; j++){
                if(ans[i][j] == -1){
                    System.out.print('#');
                }else{
                    System.out.print(ans[i][j]);
                }
            }
            
            System.out.println("");
        }
    }
}