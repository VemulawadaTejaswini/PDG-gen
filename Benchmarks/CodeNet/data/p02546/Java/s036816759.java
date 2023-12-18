import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      if (s.endsWith("s")) {
        System.out.println(s + "es");
      } else {
        System.out.println(s + "s");
      }
      sc.close();


    } catch(Exception e) {
      System.out.println(e);
      System.out.println(e.getStackTrace());
    }
  }

}