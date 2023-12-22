import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    List<Character> chList = new ArrayList<Character>();
    List<Integer> intList = new ArrayList<Integer>();

    for (int i = 0; i < S.length(); i++) {
      if (chList.contains(S.charAt(i))){
        int index = chList.indexOf(S.charAt(i));
        intList.set(index, intList.get(index) + 1);
      } else {
        intList.add(1);
        chList.add(S.charAt(i));
      }
    }

    boolean flag = true;
    if (intList.size() != 2) flag = false;
    else if(intList.get(0).intValue() != 2 || intList.get(1).intValue() != 2) flag = false;

    System.out.println(flag ? "Yes" : "No");

  }
}
