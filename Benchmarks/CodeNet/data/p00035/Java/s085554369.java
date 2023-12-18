import java.util.Scanner;

class Main{
  public static double[][] solEq(double[][] a){
    int n = a.length, m = a[0].length;
    for (int ipv = 0; ipv < n; ipv++) {
      double max = 0.0;
      int row = 0;
      for(int i = ipv; i < n; i++) {
        if(Math.abs(a[i][ipv]) > max) {
          max = a[i][ipv];
          row = i;
        }
      }
      if(max == 0.0) {
        break;
      }
      if(ipv != row) {
        for(int j = 0; j < m; j++) {
          double temp = a[ipv][j];
          a[ipv][j] = a[row][j];
          a[row][j] = temp;
        }
      }
      
      double inv_pv = 1.0/a[ipv][ipv];
      for (int j = 0; j < m; j++) {
        a[ipv][j] *= inv_pv;
      }
      
      for (int i = 0; i < n; i++) {
        if (i != ipv) {
          double temp = a[i][ipv];
          for (int j = 0; j < m; j++) {
            a[i][j] -= temp*a[ipv][j];
          }
        }
      }
    }
    return a;
  }

  public static boolean inTriangle(double[][] point){
    double[][] mat = {{point[1][0]-point[0][0],point[2][0]-point[0][0],point[3][0]-point[0][0]}
                     ,{point[1][1]-point[0][1],point[2][1]-point[0][1],point[3][1]-point[0][1]}};
    mat = solEq(mat);
    if(mat[0][2] >= 0 && mat[1][2] >= 0 && mat[0][2]+mat[1][2] <= 1 ) {
      return true;
    }
    else {
      return false;
    }
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      double[][] point1 = new double[4][2];
      String str = sc.next();
      String[] strArr = str.split(",");
      for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 2; j++) {
          point1[i][j] = Double.parseDouble(strArr[2*i+j]);
        }
      }
      double[][] point2 = {point1[1],point1[2],point1[3],point1[0]};
      double[][] point3 = {point1[2],point1[3],point1[0],point1[1]};
      double[][] point4 = {point1[3],point1[0],point1[1],point1[2]};
      if(inTriangle(point1) || inTriangle(point2) ||
         inTriangle(point3) || inTriangle(point4)) {
         System.out.println("NO");
      }
      else {
        System.out.println("YES");
      }
    }
  }
}