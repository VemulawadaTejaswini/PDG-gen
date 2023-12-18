import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int[][][] room=new int[4][3][10];
       int roomnum=sc.nextInt();
       
       for(int i=0;i<roomnum;i++)
       {
           int b=sc.nextInt();
           int f=sc.nextInt();
           int r=sc.nextInt();
           int v=sc.nextInt();
           
           room[b-1][f-1][r-1]+=v;
       }
       // Your 
     for(int i=0;i<4;i++){
       for(int x=0;x<3;x++) {
          for(int y=0;y<10;y++){
              if(y!=9){
                  System.out.printf(" %d",room[i][x][y]);
              }else{
                   System.out.printf(" %d\n",room[i][x][y]);
              }
              
          } 
       
       } 
       if(i!=3) System.out.println("####################");
     }
    } 
     
}


