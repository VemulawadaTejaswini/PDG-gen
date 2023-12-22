import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int countZero = 0, countOne = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0')
        countZero++;
      else
        countOne++;
    }
    System.out.println(countZero > countOne ? countOne*2 : countZero*2);
  }
}
