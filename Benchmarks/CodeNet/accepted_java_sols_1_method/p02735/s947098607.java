import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] field = new int[h][w];
    for(int i = 0; i < h; i++){
      char[] str = sc.next().toCharArray();
      for(int j = 0; j < w; j++){
        if(str[j] == '#'){
          field[i][j] = 1;
        }
      }
    }
    //no problem found in the input phase
    
    int[][] way = new int[h][w];
    for(int i = 1; i < h; i++){
      if(field[i][0] - field[i - 1][0] == -1){
        way[i][0] = way[i - 1][0] + 1;
      }else{
        way[i][0] = way[i - 1][0];
      }
    }
    //no problem for this block
    for(int i = 1; i < w; i++){
      if(field[0][i] - field[0][i - 1] == -1){
        way[0][i] = way[0][i - 1] + 1;
      }else{
        way[0][i] = way[0][i - 1];
      }
    }
    //no prob
    int c;
    int r;
    for(int i = 1; i < h; i++){
      for(int j = 1; j < w; j++){

        if(field[i][j] - field[i - 1][j] == -1){
          c = way[i - 1][j] + 1;
        }else{
          c = way[i - 1][j];
        }

        if(field[i][j] - field[i][j - 1] == -1){
          r = way[i][j - 1] + 1;
        }else{
          r = way[i][j - 1];
        }

        way[i][j] = Math.min(c, r);
      }
    }
    if(field[h - 1][w - 1] == 1){
      way[h - 1][w - 1]++;
    }
    System.out.println(way[h - 1][w - 1]);
  }
}