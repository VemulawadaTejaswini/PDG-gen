import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
      Scanner S = new Scanner(System.in);
      int a = S.nextInt();
      int b = S.nextInt();
      int c = S.nextInt();
      if(a < b && b < c){
      System.out.println("Yes");
              }
      else {
      System.out.println("No");
            }
      }
 }

