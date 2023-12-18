import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> t = new ArrayList<Integer>();
      for (int i=0; i<10; i++) t.add(input.nextInt());
      Collections.sort(t);
      for (int i=0; i<3; i++) System.out.println(t.get(9-i));
}
}