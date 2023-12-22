import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt(),w = sc.nextInt();
    int bom[][] = new int[h+2][w+2];
    for(int i = 1;i<=h;i++){
      String s = sc.next();
      for(int j = 1;j<=w;j++){
        if(s.substring(j-1,j).equals("#")){
          bom[i][j] = 1;
        }
      }
    }
    for(int i = 1;i<=h;i++){
      for(int j = 1;j<=w;j++){
        if(bom[i][j] == 1){
          System.out.print("#");
          continue;
        }
        int count = 0;
        if(bom[i-1][j-1] == 1){
          count++;
        }
        if(bom[i-1][j]  == 1){
          count++;
        }
        if(bom[i-1][j+1] == 1){
          count++;
        }
        if(bom[i][j-1] == 1){
          count++;
        }
        if(bom[i][j+1] == 1){
          count++;
        }
        if(bom[i+1][j-1] == 1){
          count++;
        }
        if(bom[i+1][j]  == 1){
          count++;
        }
        if(bom[i+1][j+1] == 1){
          count++;
        }
        System.out.print(count);
      }
      System.out.println("");
    }
  }
}
