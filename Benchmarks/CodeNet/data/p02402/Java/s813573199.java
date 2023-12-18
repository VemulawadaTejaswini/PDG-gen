
import java.util.Scanner;

public class Main {
  public static void main(String... args) {

    Scanner scan = new Scanner(System.in) ;

    int n = scan.nextInt() ;

    long[] arr = new long[n];

    for (int i=0; i<n; i++) arr[i] = scan.nextInt() ;

    long max = Long.MIN_VALUE ;
    long min = Long.MAX_VALUE ;
    long sum = 0 ;

    for (long i: arr) {

      if(i > max) max = i ;
      if(i < min) min = i ;
      sum += i ;
    }

    System.out.println(min + " " + max + " " + sum ) ;

  }
}

