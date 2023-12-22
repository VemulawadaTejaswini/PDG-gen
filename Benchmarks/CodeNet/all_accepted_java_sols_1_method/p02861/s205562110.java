import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[][] point = new int[N][2];
    for(int i = 0; i < N; i++){
      String[] S = sc.nextLine().split(" ");
      point[i][0] = Integer.parseInt(S[0]);
      point[i][1] = Integer.parseInt(S[1]);
    }
    
    double[][] distance = new double[N][N];
    double ans = 0.0;
    for(int i = 0; i < N; i++){
      for(int j = 0; j < N; j++){
        if(i == j){
          continue;
        }
        int x1 = point[i][0];
        int y1 = point[i][1];
        int x2 = point[j][0];
        int y2 = point[j][1];
        
        double dis = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
        ans += dis;
      }
    }
    
    int M = 1;
    for(int i = 1; i <= N; i++){
      M *= i;
    }
    ans *= M/N;
    ans /= M;
    System.out.println(ans);
  }
}