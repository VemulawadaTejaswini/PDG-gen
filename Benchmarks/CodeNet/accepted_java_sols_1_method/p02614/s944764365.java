import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        char[][] c = new char[H][W];
        for (int i=0; i<H; i++){
            c[i] = sc.next().toCharArray();
        }
        
        int ans=0;
        
        for(int h=0; h<(1<<H); h++){
            for(int w=0; w<(1<<W); w++){
                int black = 0;
                
                for(int x=0; x<W; x++){
                    for(int y=0; y<H; y++){
                        if(c[y][x]=='#' && ((1 & h>>y)==0 && (1 & w>>x)==0)){
                            black++;
                        }
                    }
                }

                if(K==black){
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

}