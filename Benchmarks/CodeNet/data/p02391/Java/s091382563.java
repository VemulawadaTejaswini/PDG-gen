import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
      Scanner S = new Scanner(System.in);
      int a = S.nextInt();
      int b = S.nextInt();
      if(a == b){
      System.out.println("a == b");
              }
      else if (a>b){
      System.out.println("a > b");
                    }
      else {
      System.out.printf("a < b");
            }
      }
 }
