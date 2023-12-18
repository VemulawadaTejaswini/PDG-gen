import java.util.Scanner;
import static java.lang.System.out;
public class Main{
  static Scanner sc=new Scanner(System.in);

   public static void main(String[] args){
      int N = sc.nextInt();
      int sqrt = (int)Math.sqrt(N);
      out.println((int)Math.pow(sqrt,2));

    
  } 
}