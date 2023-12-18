import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int H = Integer.parseInt(S[0]);
    int W = Integer.parseInt(S[1]);
    int N = Integer.parseInt(sc.nextLine());
    String[] T = sc.nextLine().split(" ");
    int[][] field = new int[H][W];
    int h = 0, w = 0;
    boolean f = true;
    for(int i = 0; i < N; i++){
      int M = Integer.parseInt(T[i]);
      for(int j = 0; j < M; j++){
        field[h][w] = i+1;
        if(f){
          if(w == W-1){
            f = false;
            h++;
          }else{
            w++;
          }
        }else{
          if(w == 0){
            h++;
            f = true;
          }else{
            w--;
          }
        }
      }
    }
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        if(j == W-1){
          System.out.println(field[i][j]);
        }else{
          System.out.print(field[i][j]+" ");
        }
      }
    }
  }
}