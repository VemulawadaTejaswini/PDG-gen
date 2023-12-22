import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  double d=s.nextDouble();
  int c=0;
  for(int i=0;i<n;i++)
  {
      int x=s.nextInt();
      int y=s.nextInt();
      long x1=x*x;
      long y1=y*y;
     double d1 = Math.hypot(x, y);
    
      if(d1<=d)
      {
      c++;
    // System.out.print(x+" "+y+"\n");
      }
  }
  System.out.println(c);
    }
}