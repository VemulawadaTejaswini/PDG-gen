import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a[][][] = new int[4][3][10];
    for (int i = 0; i < n; i++) {
      int b,f,r,v;
      b = scan.nextInt();
      f = scan.nextInt();
      r = scan.nextInt();
      v = scan.nextInt();
      a[b-1][f-1][r-1] += v;
    }

    for(int i=0; i<4; i++)
    {
      for (int j = 0; j < 3; j++)
      {
        for (int j2 = 0; j2 < 10; j2++) {
          System.out.print(" " + a[i][j][j2]);
        }
        System.out.println();
      }
      if (i!=3) System.out.println("####################");
    }
    scan.close();
  }
}

