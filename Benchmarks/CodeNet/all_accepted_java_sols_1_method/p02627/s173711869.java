import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String st = s.next();
       char c = st.charAt(0);
       if(Character.isUpperCase(c)) {
           System.out.println("A");
       }
       else {
           System.out.println("a");
       }
   }
}
