
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



 class Main{
     
    static int kami[][]=new int[10][10];//x,y
    static int maxDrop=0;
    
    
    static void printDro(int x, int y,int size){ System.out.println(x+" "+y+" "+size);}
    static void undoDro(int x,int y,int size){
            switch(size){
                case 3:kami[x-2][y]++;kami[x+2][y]++;kami[x][y-2]++;kami[x][y+2]++;
                case 2:kami[x-1][y-1]++;kami[x-1][y+1]++;kami[x+1][y-1]++;kami[x+1][y+1]++;
                case 1:kami[x][y]++;kami[x-1][y]++;kami[x+1][y]++;kami[x][y+1]++;kami[x][y-1]++; break;} 
        }
    static void doDro(int x, int y,int size){
            switch(size){
                case 3:kami[x-2][y]--;kami[x+2][y]--;kami[x][y-2]--;kami[x][y+2]--;
                case 2:kami[x-1][y-1]--;kami[x-1][y+1]--;kami[x+1][y-1]--;kami[x+1][y+1]--;
                case 1:kami[x][y]--;kami[x-1][y]--;kami[x+1][y]--;kami[x][y+1]--;kami[x][y-1]--; break;} 
        }
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         try{
             String line;
             line=br.readLine();maxDrop=Integer.parseInt(line);
             //while((line=br.readLine())!=null){if(line.isEmpty())break;
             //}
             for(int i=0; i<10;i++){String spl[] = br.readLine().split(" ");
             for(int j=0;j<10;j++)kami[j][i]=Integer.parseInt(spl[j]);}
             br.close();
             //search Start
             Main m= new Main();
             m.canSearch(0,1,1);
             
         }catch(Exception e){}         
     }
     
     boolean canSearch(int now,int prevX, int prevY){
         if(now==maxDrop)return isClear();now++;
        
         for(int i=prevX; i<9;i++){
             for(int j=(i==prevX)? prevY:1; j<9;j++){
                 
                 if(kami[i][j]==0)continue;
                 if(canSD(i,j)){
                    doDro(i,j,1);
                    if(canSearch(now,i,j)){printDro(i,j,1);return true;
                    }else undoDro(i,j,1);
                    if(canMD(i,j)){doDro(i,j,2);
                        if(canSearch(now,i,j)){printDro(i,j,2);return true;}
                        else undoDro(i,j,2);
                        if(canLD(i,j)){
                         doDro(i,j,3);if(canSearch(now,i,j)){printDro(i,j,3);return true;}
                         else{undoDro(i,j,3);}
                     }
                    }
                 }return false;
             }
         }
         return false;
     }
     static boolean isClear(){for(int i=0;i<=9;i++)for(int j=0;j<=9;j++)if(kami[i][j]!=0)return false;
     return true;}
     static boolean canSD(int x,int y){
         if(x==0||x==9||y==0||y==9)return false;
         return (kami[x-1][y]>0&&kami[x+1][y]>0&&kami[x][y-1]>0&&kami[x][y+1]>0);//&&kami[x][y]>0);
     }
     static boolean canMD(int x,int y){
         //if(x==0||x==9||y==0||y==9)return false;
         return (//kami[x-1][y]>0&&kami[x+1][y]>0&&kami[x][y-1]>0&&kami[x][y+1]>0&&kami[x][y]>0&&
                 kami[x-1][y-1]>0&&kami[x-1][y+1]>0&&kami[x+1][y-1]>0&&kami[x+1][y+1]>0);
     }
     static boolean canLD(int x,int y){
         if(x==1||x==8||y==1||y==8)return false;
         return (//kami[x-1][y]>0&&kami[x+1][y]>0&&kami[x][y-1]>0&&kami[x][y+1]>0&&kami[x][y]>0&&
                 //kami[x-1][y-1]>0&&kami[x-1][y+1]>0&&kami[x+1][y-1]>0&&kami[x+1][y+1]>0&&
                 kami[x-2][y]>0&&kami[x+2][y]>0&&kami[x][y-2]>0&&kami[x][y+2]>0);
     }
     
 }