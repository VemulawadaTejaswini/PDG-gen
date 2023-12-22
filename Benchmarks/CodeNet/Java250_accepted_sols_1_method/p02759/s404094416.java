import java.util.*;
 public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int count = 0;
     
      while(N > 0){
      N -= 2;
      count++;
     }

      System.out.print(count);
   }
 }