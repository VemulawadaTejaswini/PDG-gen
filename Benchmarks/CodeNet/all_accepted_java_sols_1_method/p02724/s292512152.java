import java.util.*;
 public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int X = sc.nextInt();
      int sum = 0;

      while(X >= 500){
         X -= 500;
         sum += 1000;
      }

      while(X >= 5){
         X -= 5;
         sum += 5;
      }

      System.out.println(sum);
   }
 }
