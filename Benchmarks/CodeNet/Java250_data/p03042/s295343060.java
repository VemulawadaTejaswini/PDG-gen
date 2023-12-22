import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    String S = scn.nextLine();
    int firstHalf = Integer.parseInt(S.substring(0, 2), 10);
    int secondHalf = Integer.parseInt(S.substring(2, 4), 10);

    boolean isYYMM = false;
    boolean isMMYY = false;
    if (secondHalf >= 1 && secondHalf <= 12) {
      isYYMM = true;
    }
    if (firstHalf >= 1 && firstHalf <= 12) {
      isMMYY = true;
    }

    String ans;
    if (isYYMM && isMMYY) {
      ans = "AMBIGUOUS";
    } else if (isYYMM) {
      ans = "YYMM";
    } else if (isMMYY) {
      ans = "MMYY";
    } else {
      ans = "NA";
    }

    System.out.println(ans);
  }

}