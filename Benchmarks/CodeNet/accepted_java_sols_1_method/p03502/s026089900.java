import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;

public class Main{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
      String N = sc.next();
      int NN = Integer.parseInt(N);
      int leng = String.valueOf(N).length();
      int result = 0;
      for(int i=0; i<leng; i++){
         
         result += Integer.parseInt(N.substring(i,i+1));

      }
      if(NN%result ==0){
         out.println("Yes");
         return;
      }
      out.println("No");

   }
}