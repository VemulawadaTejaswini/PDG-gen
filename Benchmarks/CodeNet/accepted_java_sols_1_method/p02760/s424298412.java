import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[][] = new int[3][3];
    int hit[][] = new int[3][3];
    for(int i = 0;i < 3;i++){
      for(int j = 0;j < 3;j++){
        a[i][j] = sc.nextInt();
      }
    }
    int n = sc.nextInt();
    for(int k = 0;k<n;k++){
      int b = sc.nextInt();
      for(int i = 0;i<3;i++){
        for(int j = 0;j < 3;j++){
          if(b == a[i][j]){
            hit[i][j] = 1;
          }
        }
      }
    }
    //こっからビンゴかたしかめる
    for(int i = 0;i<3;i++){
      if(hit[0][i] == 1 && hit[1][i] == 1 && hit[2][i] == 1){
        System.out.println("Yes");
        return;
      }
      if(hit[i][0] == 1 && hit[i][1] == 1 && hit[i][2] == 1){
        System.out.println("Yes");
        return;
      }
    }
    if(hit[0][0] == 1 && hit[1][1] == 1 && hit[2][2] == 1){
      System.out.println("Yes");
      return;
    }
    if(hit[0][2] == 1 && hit[1][1] == 1 && hit[2][0] == 1){
      System.out.println("Yes");
      return;
    }
    System.out.println("No");

  }
}
