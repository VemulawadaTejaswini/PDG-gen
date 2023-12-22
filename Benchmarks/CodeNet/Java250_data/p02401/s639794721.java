import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/06/01.
 */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<ArrayList<String>> ary = new ArrayList<>();

    while (true) {
      ArrayList<String> ary1 = new ArrayList<>();
      String input1 = sc.next();
      String input2 = sc.next();
      String input3 = sc.next();
      if (input2.equals("?")) break;
      ary1.add(input1);
      ary1.add(input2);
      ary1.add(input3);
      ary.add(ary1);
    }
    
    for (ArrayList<String> ary2 : ary) {
      int a = Integer.parseInt(ary2.get(0));
      String op = ary2.get(1);
      int b = Integer.parseInt(ary2.get(2));
      switch (op) {
        case "+":
          System.out.println(a + b);
          break;
        case "-":
          System.out.println(a - b);
          break;
        case "/":
          System.out.println(a / b);
          break;
        case "*":
          System.out.println(a * b);
          break;
      }
    }
  }
}