import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int h = stdIn.nextInt(); //縦
        int w = stdIn.nextInt(); //横
        int k = stdIn.nextInt(); //黒残り
        int num[][] = new int[h][w];
        int sum_tate[] = new int[w];
        int sum_yoko[] = new int[h];
        int sum = 0;
        int black = 0;
        
        
        
        for(int i = 0; i < h; i++){
            String s = stdIn.next();
            String str[] = s.split("");
            for(int j = 0; j < w; j++){
                if(str[j].equals("#")){
                    num[i][j] = 1;
                    black++;
                }else{
                    num[i][j] = 0;
                }
            }
        }
        
        for(int i = 0; i < h; i++){
            int blacknum = 0;
            for(int j = 0; j < w; j++){
                if(num[i][j] == 1){
                    blacknum++;
                }
            }
            sum_yoko[i] = blacknum;
        }
        
        for(int i = 0; i < w; i++){
            int blacknum = 0;
            for(int j = 0; j < h; j++){
                if(num[j][i] == 1){
                    blacknum++;
                }
            }
            sum_tate[i] = blacknum;
        }
        
        for(int i = 0; i < h; i++){
            int blacknum = black - sum_yoko[i];
            for(int j = 0; j < w; j++){
                int bla = blacknum - sum_tate[j];
                
                if(num[i][j] == 1){
                    bla++;
                }
                
                //System.out.println(bla);
                
                if(bla== k){
                    sum++;
                }
            }
        }
        
        System.out.println(sum);
        
    }
}
