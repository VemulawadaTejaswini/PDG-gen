import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true)
    {
      int n = sc.nextInt();
      if(n == 0) break;

      String blank = sc.nextLine();

      int sum = 0;
      double ave = 0;
      double dev = 0;

      int[] intArray = Arrays.stream(sc.nextLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();

      for(int i=0; i<n; i++){
        sum += intArray[i];
      }
      ave = sum / (double)n;

      for(int i=0; i<n; i++){
        dev += pow(intArray[i] - ave, 2.0);
      }
      System.out.printf("%.8f\n",sqrt(dev/(double)n));
    }
  }
}
