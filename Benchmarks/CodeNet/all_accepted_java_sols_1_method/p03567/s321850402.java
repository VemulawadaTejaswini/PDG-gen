import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      String str = in.next();

      if(str.indexOf("AC") != -1)
      {
          System.out.println("Yes");
      }
      else
      {
          System.out.println("No");
      }

    }
}