
import java.util.Scanner;

public class Main {
    static int w, h;
    
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
       o: while(true){
            w = scan.nextInt();
            h = scan.nextInt();
            if(w == 0 && h == 0)break;
            byte tate[][] = new byte[h][w-1];
            byte yoko[][] = new byte[h-1][w];

            for(int i = 0;i < h*2-1;i++){
                if(i % 2 == 0){
                    for(int j = 0;j < w-1;j++){
                        tate[i/2][j] = scan.nextByte();
                    }
                }else{
                    for(int j = 0;j < w;j++){
                        yoko[i/2][j] = scan.nextByte();
                    }
                }
            }

            boolean dp[][][] = new boolean[w][h][w*h+1];
            for(int i = 0;i < w*h;i++){
                for(int j = 0;j < w;j++){
                    for(int k = 0;k < h;k++){
                        dp[j][k][i] = false;
                    }
                }
            }
            dp[0][0][0] = true;
            boolean flag = true;
            for(int i = 0;i < w*h;i++){
                for(int j = 0;j < w;j++){
                    for(int k = 0;k < h;k++){
                        if(dp[j][k][i]){
                            if(j == w-1 && k == h-1){
                                System.out.println(i+1);
                                continue o;
                            }


                            if(k > 0 && yoko[k-1][j] != 1) {
                                dp[j][k-1][i+1] = true;
                                flag = false;
                                
                            }
                            if(k < h-1 && yoko[k][j] != 1) {
                                dp[j][k+1][i+1] = true;
                                flag = false;
                                
                            }
                            if(j > 0 && tate[k][j-1] != 1) {
                                dp[j-1][k][i+1] = true;
                                flag  = false;
                                
                            }
                            if(j < w-1 && tate[k][j] != 1) {
                                dp[j+1][k][i+1] = true;
                                flag = false;
                               
                            }
                            
                        }
                    }
                }
                if(flag)break;
                
                flag = true;
            }
            System.out.println(0);

        }
        
        scan.close();
    }

}
