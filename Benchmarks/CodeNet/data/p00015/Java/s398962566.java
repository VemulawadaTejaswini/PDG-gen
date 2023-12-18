import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {

    new Main().run();
  }

  public void run() {

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n;
      BigDecimal num1,num2,sum;
      n = Integer.parseInt(br.readLine());
      for (int i=0; i<n; i++) {

        num1 = new BigDecimal( br.readLine() );
        num2 = new BigDecimal( br.readLine() );

        if ( num1.precision() > 80 || num2.precision() > 80)
          System.out.println("overflow");
        else
          if( (sum = num1.add(num2)).precision() > 80 )
            System.out.println("overflow");
          else
            System.out.println(sum);
      }
    } catch (IOException e) {
      System.err.println(e);
    }
  }
}
