import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] s1 = sc.nextLine().split(" ");
    String[] s2 = sc.nextLine().split(" ");
    int[][] m = new int[2][N];
    for(int i = 0; i < N; i++){
      m[0][i] = Integer.parseInt(s1[i]);
      m[1][i] = Integer.parseInt(s2[i]);
    }
    
    int max = 0;
    for(int i = 0; i < N; i++){
      int n = 0;
      int s = 0;
      for(int j = 0; j < N; j++){
        n += m[s][j];
        if(j == i){
          s++;
          n += m[s][j];
        }
      }
      if(n > max){
        max = n;
      }
    }
    System.out.println(max);
  }
}