import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] HWM = sc.nextLine().split(" ");
    int[] lineH = new int[Integer.parseInt(HWM[0])];
    int[] lineW = new int[Integer.parseInt(HWM[1])];
    int M = Integer.parseInt(HWM[2]);
    boolean[][] map = new boolean[Integer.parseInt(HWM[0])][Integer.parseInt(HWM[1])];
    
    String[] tem;
    for(int i = 0; i < M; ++i) {
      tem = sc.nextLine().split(" ");
      ++lineH[Integer.parseInt(tem[0]) - 1];
      ++lineW[Integer.parseInt(tem[1]) - 1];
      map[Integer.parseInt(tem[0]) - 1][Integer.parseInt(tem[1]) - 1] = true;
    }
    
    int maxH = 0;
    int maxAns = 0;
    
    for(int i = 0; i < lineH.length; ++i) {
      if(lineH[i] >= maxH) {
        for(int j = 0; j < lineW.length; ++j) {
          if(maxAns < lineH[i] + lineW[j] - (map[i][j] ? 1 : 0)) {
            maxAns = lineH[i] + lineW[j] - (map[i][j] ? 1 : 0);
          }
        }
      }
    }
    
    System.out.println(maxAns);
  }
}