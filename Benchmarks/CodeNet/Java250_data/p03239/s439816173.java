import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int T = scan.nextInt();
    int MinCost = 0;
    boolean flag = false;

    int[][] d = new int[N][2];
    for(int i = 0; i < N; i++){
      d[i][0] = scan.nextInt();
      d[i][1] = scan.nextInt();
      if(d[i][1] <= T){
        flag = true;
        MinCost = d[i][0];
      }
    }


    if(flag == false){
      System.out.println("TLE");
    }else{
      for(int i = 0; i < N ; i++){
        if((T >= d[i][1])&&(MinCost > d[i][0]))
          MinCost = d[i][0];
      }
      System.out.println(MinCost);
    }
  }
}
