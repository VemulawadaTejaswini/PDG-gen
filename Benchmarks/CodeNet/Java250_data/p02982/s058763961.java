import java.util.*;

public class Main
{
  public static int getDist(int n, int d, int[] y, int[]z){
      int dist = 0;
      for(int i = 0; i<d; i++){
          dist += (y[i]-z[i])*(y[i]-z[i]);
      }
      return dist;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n, d;
	int cnt = 0;
    n = sc.nextInt();
    d = sc.nextInt();
    int[][] x = new int[n][d];
    for(int i=0;i<n;i++){
      for(int j=0; j<d; j++){
        x[i][j] = sc.nextInt();
      }
    }
    
    int s_dist = 0;
    double sqrt_dist = 0;
	for(int i=0;i<n;i++){
      for(int j=i+1; j<n; j++){
        s_dist = getDist(n, d, x[i], x[j]);
        sqrt_dist = Math.sqrt(s_dist);
        if(sqrt_dist == (int)sqrt_dist)
        {
            cnt++;
        }
      }
    }
    System.out.println(cnt);
  }
}