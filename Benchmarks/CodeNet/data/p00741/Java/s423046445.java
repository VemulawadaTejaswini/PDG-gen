import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count=0;
    while(true){
      int n=sc.nextInt();
      int r=sc.nextInt();
      if(n == 0 && r == 0){
        break;
      } else {
        
        int x[][] = new int[n+2][r+2];
        for(int z=0;z<n+2;z++){
        Arrays.fill(x[0],0);//???????????????????´?????°?????????????????????\??? 
        //?????????????????????
      }

        for(int i=1;i<n+1;i++){
          for(int j=1;j<r+1;j++){
            x[i][j]=sc.nextInt();
          }
        }

         for(int i=1;i<n+1;i++){
          for(int j=1;j<r+1;j++){
            if(x[i][j]==1){
              if(x[i-1][j-1]==2 || x[i-1][j]==2 || x[i-1][j+1]==2
                || x[i][j-1]==2 || x[i][j]==2 || x[i][j+1]==2
                || x[i+1][j-1]==2 || x[i+1][j]==2 || x[i+1][j+1]==2){
                x[i][j]=2;
              }else if(x[i-1][j-1]==1 || x[i-1][j]==1 || x[i-1][j+1]==1
                || x[i][j-1]==1 || x[i][j]==1 || x[i][j+1]==1
                || x[i+1][j-1]==1 || x[i+1][j]==1 || x[i+1][j+1]==1){
                x[i][j]=2;
              count++;
              }
            }

      }
    }
    System.out.println(count);
  }
}
}
}