import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n,d;                // n:number, d:direction
        int minX, MaxX, minY, MaxY;
        while(N != 0){
            int[][] kaiga = new int[399][399];
            int[] ZahyouX = new int[N];
            int[] ZahyouY = new int[N];
            
            for(int i = 0; i<kaiga.length; i++){
                for(int j = 0; j<kaiga[i].length; j++){
                    kaiga[i][j] = 0;
                }
            }
            
            kaiga[200][200] = 1;
            ZahyouX[0] = 200;
            ZahyouY[0] = 200;
            
            for(int i = 1; i<N; i++){
                n = sc.nextInt();
                d = sc.nextInt();
                if(d==0){
                    ZahyouX[i] = ZahyouX[n] - 1;
                    ZahyouY[i] = ZahyouY[n];
                }else if(d==1){
                    ZahyouX[i] = ZahyouX[n];
                    ZahyouY[i] = ZahyouY[n] + 1;
                }else if(d==2){
                    ZahyouX[i] = ZahyouX[n] + 1;
                    ZahyouY[i] = ZahyouY[n];
                }else if(d==3){
                    ZahyouX[i] = ZahyouX[n];
                    ZahyouY[i] = ZahyouY[n] - 1;
                }
                kaiga[ZahyouY[i]][ZahyouX[i]] = 1;
            }
            exit1:
            for(int i=0;;i++){
                for(int j=0;j<398;j++){
                    if(kaiga[i][j]==1){
                        minY = i;
                        break exit1;
                    }
                }
            }
            exit2:
            for(int i=398;;i--){
                for(int j=0;j<398;j++){
                    if(kaiga[i][j]==1){
                        MaxY = i;
                        break exit2;
                    }
                }
            }
            exit3:
            for(int i=0;;i++){
                for(int j=0;j<398;j++){
                    if(kaiga[j][i]==1){
                        minX = i;
                        break exit3;
                    }
                }
            }
            exit4:
            for(int i=398;;i--){
                for(int j=0;j<398;j++){
                    if(kaiga[j][i]==1){
                        MaxX = i;
                        break exit4;
                    }
                }
            }
            int LengthOfX = MaxX - minX + 1;
            int LengthOfY = MaxY - minY + 1;
            System.out.println(LengthOfX + " " + LengthOfY);
            
            N = sc.nextInt();
        }
        
    }
}