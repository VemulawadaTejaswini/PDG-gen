import java.io.*;
import java.util.*;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    int[][] bingo = new int[3][3];
    
    int i = 0;
    int j = 0;
    
    for(i = 0;i < 3;i++){
    bingo[i][j] = Integer.parseInt(scan.next()); //数入れる
      
      for(j = 1;j < 3;j++){
        bingo[i][j] = Integer.parseInt(scan.next()); //数入れる
      }
      j = 0;
    }
    
    int n = Integer.parseInt(scan.next()); //数入れる
    
    boolean[][] bingo_pint = new boolean[3][3];
    
    for(int s = 0;s < n;s++){
      
      //nを入れる
      int num_in = Integer.parseInt(scan.next()); //数入れる
      
      //i列
      for(i = 0;i < 3;i++){
        
        if(num_in == bingo[i][j]){
          bingo_pint[i][j] = true;
        }
        //j行
        for(j = 1;j < 3;j++){
          
          if(num_in == bingo[i][j]){
            bingo_pint[i][j] = true;
          }
        }
        j = 0;
        //j行
      }
      i = 0;
      //i行
    }
    
    if(
      //横
      (bingo_pint[0][0]&&bingo_pint[0][1]&&bingo_pint[0][2])||
      (bingo_pint[1][0]&&bingo_pint[1][1]&&bingo_pint[1][2])||
      (bingo_pint[2][0]&&bingo_pint[2][1]&&bingo_pint[2][2])||
      //縦
      (bingo_pint[0][0]&&bingo_pint[1][0]&&bingo_pint[2][0])||
      (bingo_pint[0][1]&&bingo_pint[1][1]&&bingo_pint[2][1])||
      (bingo_pint[0][2]&&bingo_pint[1][2]&&bingo_pint[2][2])||
      
      //斜め
      (bingo_pint[0][0]&&bingo_pint[1][1]&&bingo_pint[2][2])||
      (bingo_pint[0][2]&&bingo_pint[1][1]&&bingo_pint[2][0])
      )
    {      
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}