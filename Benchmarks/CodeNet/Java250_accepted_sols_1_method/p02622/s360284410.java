
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       String st = s.nextLine();
       String t = s.nextLine();
       int count = 0, len =st.length();
       for(int i = 0;i < len; ++i) {
           if(st.charAt(i)!=t.charAt(i))
               count++;
       }
       System.out.println(count);
   }
}
