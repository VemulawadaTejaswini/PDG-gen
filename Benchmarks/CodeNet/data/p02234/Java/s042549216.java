import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      String[] nums = {"0","0"};
      int[] matChain = new int[n+1];

      for(int i=0; i<n; i++) {
        nums = br.readLine().split(" ");
        matChain[i] = Integer.parseInt(nums[0]);
      }
      matChain[n] = Integer.parseInt(nums[1]);


      System.out.println( matrixChainMultiplication(matChain) );
    }
    catch (IOException e) {
      System.out.println("IOException!");
    }
  }

  private int matrixChainMultiplication(int[] p) {
    int n = p.length-1;
    int[][] m = new int[n+1][n+1];
    for(int i=1; i<=n; i++) {
      m[i][i] = 0;
    }

    for(int l=2; l<=n; l++) {
      for(int i=1,j=0; i<=n-l+1; i++) {
        j = i+l-1;
        m[i][j] = Integer.MAX_VALUE;
        for(int k=i,c=0; k<=j-1; k++) {
          c = m[i][k] + m[k+1][j] + p[i-1] * p[k] * p[j];
          m[i][j] = m[i][j] < c ? m[i][j] : c;
        }
      }
    }

    return m[1][n];
  } 
}
