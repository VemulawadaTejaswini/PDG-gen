import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      double [][] xyr = new double[2][3];
      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 3; k++) {
          xyr[j][k] = sc.nextDouble();
        }
      }
      double d = Math.sqrt(Math.pow((xyr[0][0]-xyr[1][0]),2)+Math.pow((xyr[0][1]-xyr[1][1]),2));
      if (xyr[0][2] + xyr[1][2] < d) {
        System.out.println(0);
      }
      else if (xyr[0][2] + xyr[1][2] == d) {
        System.out.println(1);
      }
      else {
        if (Math.abs(xyr[0][2] - xyr[1][2]) < d) {
          System.out.println(1);
        }
        else if (Math.abs(xyr[0][2] - xyr[1][2]) == d) {
          System.out.println(1);
        }
        else {
          if (xyr[0][2] > xyr[1][2]) {
            System.out.println(2);
          }
          else {
            System.out.println(-2);
          }
        }
      }
    }
  }
}