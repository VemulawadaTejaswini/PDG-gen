import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
      Scanner stdln = new Scanner(System.in);
      int x,i=1;
      while(true){
      x = stdln.nextInt();
      if (x==0)break;
        System.out.printf("Case %d: %d\n", i++, x);
      }
 }
}

