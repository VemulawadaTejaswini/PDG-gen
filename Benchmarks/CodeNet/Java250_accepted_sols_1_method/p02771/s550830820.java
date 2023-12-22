import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {

    Scanner sc = new Scanner(System.in);
    String sNum1 = sc.next();
    String sNum2 = sc.next();
    String sNum3 = sc.next();
    String sReuslt;
    int iResult = 0;
    if (sNum1.equals(sNum2)) {
      iResult++;
    }
    if (sNum2.equals(sNum3)) {
      iResult++;
    }
    if (sNum1.equals(sNum3)) {
      iResult++;
    }
    if (1 == iResult) {
      sReuslt = "Yes";
    } else {
      sReuslt = "No";
    }
    System.out.print(sReuslt);
  }
}
