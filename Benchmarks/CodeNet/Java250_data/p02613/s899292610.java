import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int i;
      int AC = 0;
      int TLE = 0;
      int RE = 0;
      int WA = 0;
      String ac = "AC";
      String temp = sc.nextLine();
      for(i=0;i<N;i++)
      {
          String s = sc.nextLine();
          if(s.equals("AC"))
          {
            AC++;
          }
          else if(s.equals("WA"))
            WA++;
          else if(s.equals("TLE"))
            TLE++;
          else if(s.equals("RE"))
            RE++;
      }
      System.out.println("AC"+" x "+AC);
      System.out.println("WA"+" x "+WA);
      System.out.println("TLE"+" x "+TLE);
      System.out.println("RE"+" x "+RE);
    }
}