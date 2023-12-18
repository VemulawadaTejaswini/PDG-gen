import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    String[] S = new String[H];
    for(int i=0;i<H;i++){
      S[i] = sc.next();
    }
    char[][] array = new char[H+2][W+2];
    for(int i=0;i<H;i++){
      for(int j=0;j<W;j++){
        array[i+1][j+1] = S[i].charAt(j);
      }
    }
    for(int i = 1; i <= H; i++){
      for(int j = 1; j <= W; j++){
        int count = 0;
        if(array[i][j] == '#'){
          System.out.print('#');
        }else if(array[i][j] != '#'){
          if(array[i-1][j-1] == '#'){
            count++;
          }
          if(array[i-1][j] == '#'){
            count++;
          }
          if(array[i-1][j+1] == '#'){
            count++;
          }
          if(array[i][j-1] == '#'){
            count++;
          }
          if(array[i][j+1] == '#'){
            count++;
          }
          if(array[i+1][j-1] == '#'){
            count++;
          }
          if(array[i+1][j] == '#'){
            count++;
          }
          if(array[i+1][j+1] == '#'){
            count++;
          }
          System.out.print(count);
        }
      }
      System.out.println();
    }
  }
}
