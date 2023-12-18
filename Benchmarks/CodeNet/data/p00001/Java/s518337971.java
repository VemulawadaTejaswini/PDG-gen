import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);

    String input = "0";

    while(!input.equals("")) {
      a.add(new Integer(input));
      input = in.nextLine();
    }

    Collections.sort(a);

    for(int i = 0; i < 3; i++) {
      System.out.println(a.get(a.size() - i -1));
    }  
  }
}