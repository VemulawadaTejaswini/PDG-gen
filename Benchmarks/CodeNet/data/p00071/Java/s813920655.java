

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
     static int[][] map = new int[8][8];
     static void bomb(int x, int y){
         if(map[y][x]==0)return ;
         else{// map[y][x]==1
             map[y][x]=0;
             if(y!=0)bomb(x,y-1);
             if(y>=2)bomb(x,y-2);
             if(y>=3)bomb(x,y-3);
             if(y!=7)bomb(x,y+1);
             if(y<=5)bomb(x,y+2);
             if(y<=4)bomb(x,y+3);
             if(x!=0)bomb(x-1,y);
             if(x>=2)bomb(x-2,y);
             if(x>=3)bomb(x-3,y);
             if(x!=7)bomb(x+1,y);
             if(x<=5)bomb(x+2,y);
             if(x<=4)bomb(x+3,y);
         }
     }
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             
            while((line=br.readLine())!= null){if(line.isEmpty())break;
                int n=Integer.parseInt(line);
                for(int i=0;i<n; i++){
                    line=br.readLine();
                    for(int y=0;y<8;y++){
                        line=br.readLine();
                        for(int x=0;x<8;x++)map[y][x]=Integer.parseInt(line.charAt(x)+"");
                    }
                    line=br.readLine(); int bX  =Integer.parseInt(line);
                    line=br.readLine(); int bY  =Integer.parseInt(line);
                    bomb(bX-1,bY-1);
                    System.out.println("Data "+(n+1)+":");
                    for(int y=0;y<8;y++){
                        for(int x=0;x<8;x++){
                            System.out.print(map[y][x]+"");
                        }
                        System.out.println("");
                    }
                }
                break;

            }br.close();
         }catch(Exception e){e.printStackTrace();}         
     }
     
    
}
  