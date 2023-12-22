import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws Exception{
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String[] list = s.split("/");
      if (Integer.parseInt(list[0]) < 2019) {
        System.out.println("Heisei");
        System.exit(0);
      }
      if (Integer.parseInt(list[0]) == 2019 && Integer.parseInt(list[1]) < 4) {
        System.out.println("Heisei");
        System.exit(0);  
      }
      if (Integer.parseInt(list[0]) == 2019 && Integer.parseInt(list[1]) <= 4 && Integer.parseInt(list[2]) < 31) {
        System.out.println("Heisei");
        System.exit(0);  
      }

      System.out.println("TBD");
    }
}