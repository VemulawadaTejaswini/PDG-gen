import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int[][] x = new int[n][d];
    int ans = 0;

    for(int i=0; i<n; ++i)
      for(int j=0; j<d; ++j)
        x[i][j] = sc.nextInt();

    for(int i=0; i<n-1; ++i) {
      for(int j=i+1; j<n; ++j) {
        double kyori = 0;
        for(int k=0; k<d; ++k) {
          int calc = Math.abs(x[i][k] - x[j][k]);
          kyori = kyori + calc*calc;
        }
        kyori = Math.sqrt(kyori);
        if(kyori - (int)kyori == 0.0) ++ans;
      }
    }

    System.out.println(ans);
  }
}