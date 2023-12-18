import java.util.Scanner;
//import java.lang.Math;

public class Main {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    while(true)
    {
      int m = scan.nextInt();
      int f = scan.nextInt();
      int r = scan.nextInt();
      if( m == -1 || f == -1 )
      {
        if ( m == -1 && f == -1 && r == -1 ) break;
        System.out.println("F");
        continue;
      }
      String s;
      int sum = m + f;
      if ( sum >= 80 ) s = "A";
      else if ( sum >= 65 ) s = "B";
      else if ( sum >= 50 ) s = "C";
      else if ( sum >= 30 )
      {
        if ( r >= 50 ) s = "C";
        else s = "D";
      } else s = "F";

      System.out.println(s);
    }
    scan.close();
  }
}

