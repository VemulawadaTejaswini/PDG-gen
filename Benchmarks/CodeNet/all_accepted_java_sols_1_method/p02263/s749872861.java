import java.util.Stack;
import java.util.Scanner;

public class Main{
   public static void main(String[] wjy){
      Stack<String> s = new Stack<String>();
      Scanner in = new Scanner(System.in);
      String input = in.nextLine();
      in.close();
      Scanner amd = new Scanner(input);
      while (amd.hasNext()){
         String a = amd.next();
         if (a.equals("+")){
           int z = Integer.parseInt(s.pop())+Integer.parseInt(s.pop());
           s.push(z+"");
         }
         else if (a.equals("-")){
           int z = -Integer.parseInt(s.pop())+Integer.parseInt(s.pop());
           s.push(z+"");
         }
         else if (a.equals("*")){
           int z = Integer.parseInt(s.pop())*Integer.parseInt(s.pop());
           s.push(z+"");
         }
         else{
           s.push(a);
         }
    }
   amd.close();
   System.out.println(s.pop());    
  }
}
