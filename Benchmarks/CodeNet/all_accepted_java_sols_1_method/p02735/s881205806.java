import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int H = sn.nextInt();
        int W = sn.nextInt();
        String[][] S = new String[H][W];
        int N[][] = new int[H][W];
        int r0 = 0;
        int r1 = H-1;
        int c0 = 0;
        int c1 = W-1;
        int cnt = 0;

        for(int i=0; i<H; i++){
            String s = sn.next();
            for(int j=0; j<W; j++){
                S[i][j] = s.substring(j, j+1);
            }
        }

        if(S[0][0].equals("#")) N[0][0] = 1;
        else N[0][0] = 0;

        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(i == 0 && j == 0) continue;

                if(i == 0){
                    if(S[i][j].equals("#") && S[i][j-1].equals(".")){
                        N[i][j] = N[i][j-1] + 1;
                    }else{
                        N[i][j] = N[i][j-1];
                    }
                }else if(j == 0){
                    if(S[i][j].equals("#") && S[i-1][j].equals(".")){
                        N[i][j] = N[i-1][j] + 1;
                    }else{
                        N[i][j] = N[i-1][j];
                    }
                }else{
                    if(S[i][j].equals("#") && S[i-1][j].equals(".")){
                        if(S[i][j-1].equals(".")){
                            N[i][j] = Math.min(N[i-1][j]+1, N[i][j-1]+1);
                        }else{
                            N[i][j] = Math.min(N[i-1][j]+1, N[i][j-1]);
                        }
                    }else{
                        if(S[i][j].equals("#") && S[i][j-1].equals(".")){
                            N[i][j] = Math.min(N[i-1][j], N[i][j-1]+1);
                        }else{
                            N[i][j] = Math.min(N[i-1][j], N[i][j-1]);
                        }
                        
                    }
                }
            }
        }

        System.out.println(N[H-1][W-1]);
    }
}