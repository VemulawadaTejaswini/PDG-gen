import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int x = 1;
    StringBuffer sb = new StringBuffer("");
      int n = in.nextInt();
      int m = in.nextInt();
      if( x != 1 ) sb.append("\n");
      in.nextLine();
      char[][] grid = new char[m][n];
      int[][] copy = new int[m][n];
      for( int i = 0; i < n; i++ ){
        String s = in.nextLine();
        for( int j = 0; j < m; j++ ){
          grid[j][i] = s.charAt(j);
        }
      }
      for( int i = 0; i < m; i++ ){
        for( int j = 0; j < n; j++ ){
          if( i == 0 ){
            if(grid[i][j] != '#'){
              if(j != 0 && j != n-1){
                if(grid[i][j-1] == '#') copy[i][j]++;
                if(i < m - 1){
                  if(grid[i+1][j] == '#') copy[i][j]++;
                  if(grid[i+1][j-1] == '#') copy[i][j]++;
                  if(j < n - 1){
                    if(grid[i+1][j+1] == '#') copy[i][j]++;
                  }
                }
                if(grid[i][j+1] == '#') copy[i][j]++;
              }else if( j == 0 ){
                if( j < n - 1 ){
                  if(grid[i][j+1] == '#') copy[i][j]++;
                }
                if( i < m - 1 ){
                  if(grid[i+1][j] == '#') copy[i][j]++;
                }
                if( i < m - 1 && j < n - 1 ){
                  if(grid[i+1][j+1] == '#') copy[i][j]++;
                }
              }else{
                if(i < m - 1){
                  if(grid[i+1][j] == '#') copy[i][j]++;
                  if(grid[i+1][j-1] == '#') copy[i][j]++;
                }
                if(grid[i][j-1] == '#') copy[i][j]++;
              }
            }else copy[i][j] = -1;
          }else if( i == m - 1 ){
            if(grid[i][j] != '#'){
              if(j != 0 && j != n-1){
                if(grid[i][j-1] == '#') copy[i][j]++;
                if( i > 0 ){
                  if(grid[i-1][j-1] == '#') copy[i][j]++;
                  if(grid[i-1][j] == '#') copy[i][j]++;
                  if(grid[i-1][j+1] == '#') copy[i][j]++;
                }
                if(grid[i][j+1] == '#') copy[i][j]++;
              }else if( j == 0 ){
                if( j < n - 1 ){
                  if(grid[i][j+1] == '#') copy[i][j]++;
                  if( i > 0 ){
                    if(grid[i-1][j+1] == '#') copy[i][j]++;
                  }
                }
                if( i > 0 ){
                  if(grid[i-1][j] == '#') copy[i][j]++;
                }   
              }else{
                if( i > 0 ){
                  if(grid[i-1][j] == '#') copy[i][j]++;
                  if(grid[i-1][j-1] == '#') copy[i][j]++;
                }
                if(grid[i][j-1] == '#') copy[i][j]++;
              }
            }else copy[i][j] = -1;
          }else{
            if(grid[i][j] != '#'){
              if(j != 0 && j != n-1){
                if(grid[i][j-1] == '#') copy[i][j]++;
                if(grid[i-1][j-1] == '#') copy[i][j]++;
                if(grid[i-1][j] == '#') copy[i][j]++;
                if(grid[i-1][j+1] == '#') copy[i][j]++;
                if(grid[i][j+1] == '#') copy[i][j]++;
                if(grid[i+1][j+1] == '#') copy[i][j]++;
                if(grid[i+1][j] == '#') copy[i][j]++;
                if(grid[i+1][j-1] == '#') copy[i][j]++;
              }else if( j == 0 ){
                if(grid[i+1][j] == '#') copy[i][j]++;
                if(grid[i-1][j] == '#') copy[i][j]++;
                if(j < n - 1){
                  if(grid[i-1][j+1] == '#') copy[i][j]++;
                  if(grid[i][j+1] == '#') copy[i][j]++;
                  if(grid[i+1][j+1] == '#') copy[i][j]++;
                }
              }else{
                if(grid[i][j-1] == '#') copy[i][j]++;
                if(grid[i-1][j-1] == '#') copy[i][j]++;
                if(grid[i+1][j] == '#') copy[i][j]++;
                if(grid[i-1][j] == '#') copy[i][j]++;
                if(grid[i+1][j-1] == '#') copy[i][j]++;
              }
            }else copy[i][j] = -1;
          }
        }
      }
      x++;
      for(int i = 0; i < n; i++ ){
        for( int j = 0; j < m; j++ ){
          if(copy[j][i] == -1) sb.append("#");
          else sb.append(copy[j][i]);
        }
        sb.append("\n");
      }
    System.out.print(sb);
  }
}