import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int H = in.nextInt();
    int W = in.nextInt();
    in.nextLine();
    boolean[][] obj = new boolean[H][W];
    int[][] left = new int[H][W];
    int[][] top = new int[H][W];
    int[][] right = new int[H][W];
    int[][] bottom = new int[H][W];
    
    for(int h=0; h<H; h++){
      char[] c = in.nextLine().toCharArray();
      for(int w=0; w<W; w++){
        if(c[w]=='#'){
          obj[h][w] = true;
          left[h][w] = 0;
          top[h][w] = 0;
        }else{
          obj[h][w] = false;
          if(w==0){
            left[h][w] = 1;
          }else{
            left[h][w] = left[h][w-1]+1;
          }
          if(h==0){
            top[h][w] = 1;
          }else{
            top[h][w] = top[h-1][w]+1;
          }
        }
      }
    }
    int max=0;
    for(int h=H-1; h>=0; h--){
      for(int w=W-1; w>=0; w--){
        if(obj[h][w]){
          right[h][w] = 0;
          bottom[h][w] = 0;
        }else{
          if(w==W-1){
            right[h][w] = 1;
          }else{
            right[h][w] = right[h][w+1]+1;
          }
          if(h==H-1){
            bottom[h][w] = 1;
          }else{
            bottom[h][w] = bottom[h+1][w]+1;
          }
        }
        int num = left[h][w]+top[h][w]+right[h][w]+bottom[h][w]-3;
        if(max < num){
          max = num;
        }
      }
    }
    System.out.println(max);
  }
}