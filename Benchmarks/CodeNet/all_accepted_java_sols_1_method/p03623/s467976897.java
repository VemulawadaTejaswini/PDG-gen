import java.util.Scanner;
public class Main {
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      final int x = sc.nextInt();//4
      int a = sc.nextInt();//5
      int b = sc.nextInt();//6
      int xa,xb;
      if(x>a){
         xa = x-a;
      }else{
         xa = a-x;//1

      }
      if(x>b){
         xb = x-b;
      }else{
         xb = b-x;//2
      }
      if(xa>xb){
         System.out.println("B");
      }else{
         System.out.println("A");
      }
   }
}