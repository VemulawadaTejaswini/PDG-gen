import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      String a = in.next();
      String b = in.next();

      StringBuffer sb = new StringBuffer(b);
      String b2 = sb.reverse().toString();

      if(a.equals(b2)) {
          System.out.println("YES");
      }
      else {
          System.out.println("NO");
      }


    }
}