import java.util.Scanner;

/**
 * Created 2017/05/25.
 * nextLineの挙動とか
 */
public class Main {
   public static void main(String[] args) {
      //String word = "AAA";
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();

     if(line.charAt(0) == line.charAt(1) && line.charAt(1) == line.charAt(2)){
        System.out.println("No");
     }else{
        System.out.println("Yes");
     }

   }
}
