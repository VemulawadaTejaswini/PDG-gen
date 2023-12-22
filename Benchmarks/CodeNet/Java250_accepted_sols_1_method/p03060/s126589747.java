import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {

    Scanner sc = new Scanner(System.in);
    int iNum = sc.nextInt();
    sc.nextLine();
    String sValue = sc.nextLine();
    String sCost = sc.nextLine();
    String[] sSplitVal = sValue.split(" ");
    String[] sSplitCost = sCost.split(" ");
    int iResult = 0;
    for (int ii = 0; ii < iNum; ii++) {
      int iVal = Integer.parseInt(sSplitVal[ii]);
      int iCost = Integer.parseInt(sSplitCost[ii]);
      int iCalc = iVal - iCost;
      if (0 < iCalc) {
        iResult += iCalc;
      }
    }
    System.out.print(iResult);
  }
}
