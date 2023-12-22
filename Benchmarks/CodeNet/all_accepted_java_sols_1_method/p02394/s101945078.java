import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
      Scanner S = new Scanner(System.in);
      int W = S.nextInt();
      int H = S.nextInt();
      int x = S.nextInt();
      int y = S.nextInt();
      int r = S.nextInt();
      if(W>x && H>y && x>0 && y>0 && W-2*r>=0 && H-2*r>=0){
      System.out.println("Yes");
      }
      else{
      System.out.println("No");
      }
}
}
