import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   //??????????????¶??°?????\???
   int n = Integer.parseInt(br.readLine());
   int[][][] room = new int[4][3][10];//??¨?±?????????°
    
   for(int i = 0;i < 4;i++){
     for(int j = 0;j < 3;j++){ 
       for(int k = 0;k < 10;k++){
         room[i][j][k] = 0;//??????????????°???0????????????
       }
     }
   }
     
    for(int i = 0;i < n;i++){   
     String line = br.readLine();  
     String[] token = line.split(" ");
     int b, f, r, v; //?£?????????°?????¨?±???????,????????\?±?       
     b = Integer.parseInt(token[0]);
     f = Integer.parseInt(token[1]);
     r = Integer.parseInt(token[2]);
     v = Integer.parseInt(token[3]);
     room[b-1][f-1][r-1] += v;
 
    } 

    for(int i = 0;i < 4;i++){
     for(int j = 0;j < 3;j++){ 
       for(int k = 0;k < 10;k++){
         System.out.print(" " + room[i][j][k]);
       }
       System.out.println();
     }
      if(i != 3){   
       System.out.println("####################");
      }
    }

  }
}