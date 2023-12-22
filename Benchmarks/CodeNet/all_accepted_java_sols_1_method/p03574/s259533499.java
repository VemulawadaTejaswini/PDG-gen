import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplit[] = br.readLine().split(" ");
            int H = Integer.parseInt(strSplit[0]);
            int W = Integer.parseInt(strSplit[1]);
            char HW[][] = new char[H][W];
            int xNESW[] = {0, 1, 1 ,1 ,0 ,-1, -1, -1};
            int yNESW[] = {-1, -1, 0, 1, 1, 1, 0, -1};
            
            for(int i=0; i<H; i++){
                String str = br.readLine();
                for(int j=0; j<W; j++){
                    HW[i][j] = str.charAt(j);
                }
            }
            
            for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    char count = '#';
                    
                    if(HW[i][j] == '.'){
                        count = '0';
                        for(int k=0; k<8; k++){
                            if((i+yNESW[k]) >= 0 && (i+yNESW[k])<H && (j+xNESW[k])>=0 && (j+xNESW[k])<W && HW[i+yNESW[k]][j+xNESW[k]] == '#'){
                                count++;
                            }
                        }
                    }
                    
                    System.out.print(count);
                }
                System.out.println();
            }
            
        }catch(Exception e){
            
        }
    }
}