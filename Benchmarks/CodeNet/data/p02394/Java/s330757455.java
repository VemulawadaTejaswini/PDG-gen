import util.java.Scanner;

public class Main{
   Public static void main(String [] Args){
      Scanner sc = new Scanner(System.in);
      int  W = sc.nextInt();
      int  H = sc.nextInt();
      int  x = sc.nextInt();
      int  y = sc.nextInt();
      int  r = sc.nextInt();
      
      int a;
      a = W*H;
      s = r*r*Math.PI;
      e=a-s;
      if(x<W && y<H && x>0 && y>0)
        System.out.println("Yes");
      else
        System.out.println("No");
   }
}
