import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int W = Integer.parseInt(sc.next());
        int H = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        
        int[][] rect = new int[H][W];
        
        for(int n=0; n<N; n++){
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next());
            
            if(a == 1){
                for(int i=0; i<H; i++){
                    for(int j=0; j<x; j++){
                        rect[i][j] = 1;
                    }
                }
            }
            if(a == 2){
                for(int i=0; i<H; i++){
                    for(int j=x; j<W; j++){
                        rect[i][j] = 1;
                    }
                }
            }
            if(a == 3){
                for(int i=0; i<y; i++){
                    for(int j=0; j<W; j++){
                        rect[i][j] = 1;
                    }
                }
            }
            if(a == 4){
                for(int i=y; i<H; i++){
                    for(int j=0; j<W; j++){
                        rect[i][j] = 1;
                    }
                }
            }
        }
        
        int ans = 0;
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(rect[i][j] == 0){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}