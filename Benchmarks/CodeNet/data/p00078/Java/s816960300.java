import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n;
    while((n = scan.nextInt()) != 0){
      int mas[][] = new int[n][n];
      for(int i=1,x=n/2+1,y=n/2;i<=n*n;i++,x=(x+1)%n,y=(y+1)%n){
        if(mas[x][y] != 0){
          x = (x + 1) % n;
          y = (y - 1 + n) % n;
        }
        mas[x][y] = i;
      }
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          out.printf("%4d",mas[i][j]);
        }
        out.println();
      }
    }
  }
}