import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      double[][] point = new double[4][2];
      for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 2; j++) {
          point[i][j] = sc.nextDouble();
        }
      }
      double[] vecAB = {point[1][0]-point[0][0],point[1][1]-point[0][1]};
      double[] vecCD = {point[3][0]-point[2][0],point[3][1]-point[2][1]};
      if(vecAB[0]*vecCD[0]+vecAB[1]*vecCD[1] == 0) {
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }
}