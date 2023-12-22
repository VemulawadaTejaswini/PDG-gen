import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[][] a = new int[3][3];
    int[] x = new int[3];
    int[] y = new int[3];
    int max = Integer.MIN_VALUE;
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        a[i][j] = sc.nextInt();
        if(a[i][j] > max){
          max = a[i][j];
        }
      }
    }
    String f = "Yes";
    
    x[0] = 0;
    for(int j=0; j<3; j++){
      y[j] = a[0][j] - x[0];
    }
    for(int j=0; j<3; j++){
      x[j] = a[j][0] - y[0];
    }
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        if(a[i][j] != x[i]+y[j]){
          f = "No";
        }
      }
    }
    System.out.println(f);

    sc.close();
  }
}
