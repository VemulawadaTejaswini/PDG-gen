import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    char[][] map = new char[h][w];
    for(int i = 0; i < h; i++){
      String line = sc.next();
      for(int j = 0; j < w; j++){
        map[i][j] = line.charAt(j);
      }
    }
    int answer = 0;

    for(int sh = 0; sh < (1 << h); sh++) {
      for (int sw = 0; sw < (1 << w); sw++) {
        int count = 0;
        for(int idxh = 0; idxh < h; idxh++){
          if((1 & (sh >> idxh)) == 1) continue;
          for(int idxw = 0; idxw < w; idxw++){
            if((1 & (sw >> idxw)) == 1) continue;
            if(map[idxh][idxw] == '#') count++;
          }
        }
        if(count == k){
          answer++;
        }
      }
    }
    System.out.println(answer);
  }
}