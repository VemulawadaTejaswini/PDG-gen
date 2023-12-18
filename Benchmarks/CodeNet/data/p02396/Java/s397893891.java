import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("入力してください。");
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    while(input.hasNextInt()) {
      int value = input.nextInt();
      if(value == 0) {
        break;
      }
      list.add(value);
    }
    for (int i = 0; i < list.size(); i++) {
      System.out.println("Case " + (i+1) + ": " + list.get(i));
    }
  }
}
