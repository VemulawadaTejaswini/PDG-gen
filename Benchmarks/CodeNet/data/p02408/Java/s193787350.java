import java.util.*;

import java.io.*;
public class Main {
    public static void main(String[] args){
        // Your 
     
     Scanner sc= new Scanner(System.in);
     boolean[][] card = new boolean[4][13];
     int num=sc.nextInt();
     for(int i=0;i<num;i++){
         String sign= sc.next();
         int cards=sc.nextInt();
         switch(sign){
             case "S":
                 card[0][cards-1]=true;
                 break;
             case "H":
                 card[1][cards-1]=true;
                 break;
            case "C":
                 card[2][cards-1]=true;
                 break;
            case "D":
                 card[3][cards-1]=true;
                 break;
    
         }
     }
     
     for(int i=0;i<4;i++)
     {
         for(int y= 0;y<13;y++){
             if(card[i][y]==false){
                 switch(i){
                 case 0:
                     System.out.printf("S %d\n",y+1);
                     break;
                     case 1:
                     System.out.printf("H %d\n",y+1);
                     break;
                     case 2:
                     System.out.printf("C %d\n",y+1);
                     break;
                     case 3:
                     System.out.printf("D %d\n",y+1);
                     break;
             }
         }
     }
        
}
}
}

