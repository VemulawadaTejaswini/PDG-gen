import java.util.*;
class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int ac = 0;
          int wa =0;
          int tle =0;
          int re=0;
      while(n-->0)
      {
          String s = sc.next();
          
          if(s.equals("AC"))
            ac++;
          else if(s.equals("TLE"))
            tle++;
          else if(s.equals("RE"))
            re++;
          else if(s.equals("WA"))
            wa++;
      }
            System.out.println("AC x " + ac);
            System.out.println("WA x " + wa);
            System.out.println("TLE x " + tle);
            System.out.println("RE x " + re);
    }
}