import java.util.Scanner;

import com.sun.org.apache.xml.internal.utils.res.LongArrayWrapper;

public class Main{
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    int n = sin.nextInt();
    int[] a = new int[n];
    a[0] = sin.nextInt();
    int min = a[0];
    int max = a[0];
    long sum = a[0];

    for ( int i = 1; i < a.length; i++) {
      a[i] = sin.nextInt();
      if(a[i] < min) min = a[i];
      else if(a[i] > max) max = a[i];
      sum += (long)a[i];
    }

    System.out.println(min + " " + max + " " + sum);
    sin.close();
  }
}
