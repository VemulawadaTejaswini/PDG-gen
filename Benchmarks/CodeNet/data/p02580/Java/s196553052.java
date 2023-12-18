import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int H = sc.nextInt();
      int W = sc.nextInt();
      int M = sc.nextInt();
      int[][] grid = new int[H][W];
      int[] bombH = new int[H];
      int[] bombW = new int[W];
      int maxH = 0;
      int maxW = 0;
      for(int i = 0; i < M; i++){
        int row = sc.nextInt();
        int col = sc.nextInt();
        grid[row-1][col-1] = 1;
        bombH[row-1]++;
        bombW[col-1]++;
        
        if(bombH[row-1] > maxH){
          maxH = bombH[row-1];
        }
        if(bombW[col-1] > maxW){
          maxW = bombW[col-1];
        }
      }
      
      // 候補算出
      List<Integer> maxListH = new ArrayList<>();
      List<Integer> maxListW = new ArrayList<>();
      for(int i = 0; i < H; i++){
        if(bombH[i] == maxH){
          maxListH.add(i);
        }
      }
      for(int i = 0; i < W; i++){
        if(bombW[i] == maxW){
          maxListW.add(i);
        }
      }
      
      
      // 爆破数算出
      int count = maxH + maxW - 1;
      outside : for(int i = 0; i < maxListH.size(); i++){
        int h = maxListH.get(i);
        for(int j = 0; j < maxListW.size(); j++){
          int w = maxListH.get(i);
          if(grid[h][w] == 0){
            count++;
            break outside;
          }
        }
      }
      
      // 出力
      System.out.println(count);
    }
    
}