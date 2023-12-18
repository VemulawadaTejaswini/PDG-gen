import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char grid[][] = new char [H][W];
    for(int i=0; i<H; i++){
      //for(int j=0; j<W; j++){
        grid[i]=sc.next().toCharArray();
      //}
    }
    
    int cnt[][] = new int [H][W];
    for(int i=0; i<H; i++){
      for(int j=0; j<W; j++){
        if(grid[i][j] == '#'){
          cnt[i][j] = -1;
          continue;
        }
        if(j-1>=0 && grid[i][j-1] == '#'){
          cnt[i][j]++;
        }//left
        if(j+1<W && grid[i][j+1] == '#'){
          cnt[i][j]++;
        }//right
        if(i-1>=0 && grid[i-1][j] == '#'){
          cnt[i][j]++;
        }//up
        if(i+1<H && grid[i+1][j] == '#'){
          cnt[i][j]++;
        }//down
        if(i-1>=0 && j-1>=0 && grid[i-1][j-1] == '#'){
          cnt[i][j]++;
        }//left-up
        if(i-1>=0 && j+1<W && grid[i-1][j+1] == '#'){
          cnt[i][j]++;
        }//right-up
        if(i+1<H && j+1<W && grid[i+1][j+1] == '#'){
          cnt[i][j]++;
        }//left-down
        if(i+1<H && j-1>=0 && grid[i+1][j-1] == '#'){
          cnt[i][j]++;
        }//right-down
      }
    }
    String ans = "";
    for(int i=0; i<H; i++){
      for(int j=0; j<W; j++){
        if(cnt[i][j]==-1){
          ans += '#';
        }else {
          ans += cnt[i][j];
        }
      }
      System.out.println(ans);
      ans = ""; 
    }
  }
}
    