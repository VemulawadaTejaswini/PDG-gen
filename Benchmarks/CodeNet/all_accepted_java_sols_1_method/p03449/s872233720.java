import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[][] = new int [2][n];
    for(int i = 0;i < 2;i++){
      for(int j = 0;j < n;j++){
        a[i][j] = sc.nextInt();
      }
    }
    int max = 0;
    int x = 0;
    int count = n;
    while(count > 0){
      int sum = 0;
      int i = 0;
      for(int j = 0;j < n;j++){
        sum += a[i][j];
        if(j == x){
          i++;
          sum += a[i][j];
        }
      }
      if(max < sum){
        max = sum;
      }
      x++;
      count--;
    }
    System.out.println(max);
  }
}