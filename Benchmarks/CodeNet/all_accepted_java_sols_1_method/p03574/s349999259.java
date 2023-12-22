import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String blank = sc.nextLine();
    char[][] s = new char[h][w];
    int dx[] = {1, 1, 1, 0, 0, -1, -1, -1};
    int dy[] = {0, 1, -1, 1, -1, 0, 1, -1};

    for(int i = 0; i < h; i++){
      String ss = sc.nextLine();
      s[i] = ss.toCharArray();
    }

    for(int i = 0; i < h; i++){
      for(int j = 0; j < w; j++){
        if(s[i][j] == '.'){
          int cnt = 0;
          for(int k = 0; k < 8; k++){
            int tmpX = i + dx[k];
            int tmpY = j + dy[k];
            if(tmpX>=0 && tmpX<h && tmpY>=0 && tmpY<w&& s[tmpX][tmpY] == '#'){
              cnt++;
            }
          }
          char d[] = String.valueOf(cnt).toCharArray();
          s[i][j] = d[0];
        }
      }
    }

    for(int i = 0; i < h; i++){
      for(int j = 0; j < w; j++){
        System.out.print(s[i][j]);
      }
      System.out.println("");
    }


  }
}
