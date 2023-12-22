import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[2][n];
    for(int i = 0;i<2;i++){
      for(int j = 0;j<n;j++){
        a[i][j] = sc.nextInt();
      }
    }
    int max = 0;
    int total = a[1][n-1];
    for(int i = 0;i<n;i++){
      total += a[0][i];
    }
    max = total;
    for(int i = 0;i<n-1;i++){
      total+=a[1][n-1-i-1];
      total-=a[0][n-1-i];
      max = Math.max(max,total);
    }
    System.out.println(max);
  }
}
