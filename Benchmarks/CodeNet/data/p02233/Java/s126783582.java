import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

  private int[] memoF;

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      memoF = new int[n+1];

      System.out.println( fibonacci(n) );
    }
    catch (IOException e) {
      System.out.println("IOException!");
    }
  }

  private int fibonacci(int n) {
    if( (n == 0) || (n== 1) ) return memoF[n] = 1;
    if( memoF[n] != 0 ) return memoF[n];

    return memoF[n] = fibonacci(n-2) + fibonacci(n-1);
  } 
}
