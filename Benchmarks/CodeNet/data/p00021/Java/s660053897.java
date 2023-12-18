import java.util.Scanner;
class Main{
  public static double slope(double[] A, double[] B){
    double slope = (B[1]-A[1])/(B[0]-A[0]);
    return slope;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      double [][] point = new double[4][2];
      for (int j = 0; j < 4; j++) {
        for (int k = 0; k < 2; k++) {
          point[j][k] = sc.nextDouble();
        }
      }
      if(slope(point[0], point[1]) == slope(point[2], point[3])) {
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }
}