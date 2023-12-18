

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 
 
 
 class Main{
      
    static int kami[][]=new int[10][10];//x,y
    static int maxDrop=0;
    static ArrayList<drop> answer = new ArrayList<drop>();
    class drop{
        int x , y , size;
        drop(int x,int y,int size){this.x=x;this.y=y;this.size=size;}
        void doDro(){
            switch(size){
                case 3:kami[x-2][y]--;kami[x+2][y]--;kami[x][y-2]--;kami[x][y+2]--;
                case 2:kami[x-1][y-1]--;kami[x-1][y+1]--;kami[x+1][y-1]--;kami[x+1][y+1]--;
                case 1:kami[x][y]--;kami[x-1][y]--;kami[x+1][y]--;kami[x][y+1]--;kami[x][y-1]--; break;} 
        }
        void undoDro(){
            switch(size){
                case 3:kami[x-2][y]++;kami[x+2][y]++;kami[x][y-2]++;kami[x][y+2]++;
                case 2:kami[x-1][y-1]++;kami[x-1][y+1]++;kami[x+1][y-1]++;kami[x+1][y+1]++;
                case 1:kami[x][y]++;kami[x-1][y]++;kami[x+1][y]++;kami[x][y+1]++;kami[x][y-1]++; break;} 
        }
        void printDro(){
            System.out.println(x+" "+y+" "+size);
        }
         
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
             for(drop d:answer){d.printDro();}
              
         }catch(Exception e){}         
     }
      
     boolean canSearch(int now,int prevX, int prevY){
         if(now==maxDrop)return isClear();now++;
         int count=0;
         for(int j=0; j<=9;j++){
             for(int i=0; i<=9;i++){
                 count++;
                 //System.out.println("c"+count+" i"+i+" j"+j);
                 if(kami[i][j]==0)continue;
                 boolean canLDflag=false,canMDflag=false;
                                   
                if(canLD(i,j+2)){canLDflag=true;
                    drop d = new drop(i,j+2,3);
                    d.doDro();if(canSearch(now,i,j)){answer.add(d);return true;}
                    else{d.undoDro();}
                }
                 
                 if((canMD(i+1,j+1))){canMDflag=true;drop d=new drop(i+1,j+1,2);d.doDro();
                    if(canSearch(now,i,j)){answer.add(d);return true;}
                    else{d.undoDro();}}
                 if(canSD(i,j+1)){drop d=new drop(i,j+1,1);d.doDro();
                    if(canSearch(now,i,j)){answer.add(d);return true;}
                    else{d.undoDro();}}
                 
                  /*System.out.println("d");for(int a=0;a<10;a++){
                      for(int b=0;b<10;b++){System.out.print(kami[b][a]+" ");}
                      System.out.println("");}*/return false;
             }
         }
         return false;
     }
     static boolean isClear(){for(int i=0;i<=9;i++)for(int j=0;j<=9;j++)if(kami[i][j]!=0)return false;
     return true;}
     static boolean canSD(int x,int y){
         if(x==0||x==9||y==0||y==9)return false;
         return (kami[x-1][y]>0&&kami[x+1][y]>0&&kami[x][y-1]>0&&kami[x][y+1]>0&&kami[x][y]>0);
     }
     static boolean canMD(int x,int y){
         if(x==0||x==9||y==0||y==9)return false;
         return (kami[x-1][y]>0&&kami[x+1][y]>0&&kami[x][y-1]>0&&kami[x][y+1]>0&&kami[x][y]>0&&
                 kami[x-1][y-1]>0&&kami[x-1][y+1]>0&&kami[x+1][y-1]>0&&kami[x+1][y+1]>0);
     }
     static boolean canLD(int x,int y){
         if(x<=1||x>=8||y<=1||y>=8)return false;
         return (kami[x-1][y]>0&&kami[x+1][y]>0&&kami[x][y-1]>0&&kami[x][y+1]>0&&kami[x][y]>0&&
                 kami[x-1][y-1]>0&&kami[x-1][y+1]>0&&kami[x+1][y-1]>0&&kami[x+1][y+1]>0&&
                 kami[x-2][y]>0&&kami[x+2][y]>0&&kami[x][y-2]>0&&kami[x][y+2]>0);
     }
      
 }