import java.util.*;
import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.close();
    
    DecimalFormat df = new DecimalFormat("0.0000000000");
    System.out.println(df.format((N % 2 == 0) ? 1.0/2 : 1.0*((N / 2) + 1) / N));
  }
}
